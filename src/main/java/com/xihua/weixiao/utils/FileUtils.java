package com.xihua.weixiao.utils;

import com.xihua.weixiao.serviceImpl.SuggestionServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName UpdateFileUtils
 * @Auhtor ygh
 * @DATE 2019/8/4 10:36
 **/
@Component
public class FileUtils {
    @Value("${server.url}")
    private String serverUrl;
    private static final Logger LOGGER = LoggerFactory.getLogger(SuggestionServiceImpl.class);

    public String getUpUrl(String type,MultipartFile[] files){
        String name = "";
        if (null==files){
            return name;
        }
        //定义时间戳作为文件名的一部分吗，为了文件名不重复定义时间戳为文件名
        String path = System.getProperty("user.dir")+"\\src\\main\\resources\\static\\images\\";
        File dir = new File(path, type);
        String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        if(!dir.exists()){
            dir.mkdirs();
        }
        // MultipartFile自带的解析方法
        for (MultipartFile multipartFile:files) {
            File file = new File(path + "\\" + type + "\\" + fileName + ".png");
            try {
                multipartFile.transferTo(file);
            } catch (IOException e) {
                LOGGER.info("转化文件失败",e);
            }
            name = name + serverUrl + type + file.getName() + "$%";
        }
        if (!name.equals("")){
            name = name.substring(0,name.length()-2);
        }
        return name;
    }
}
