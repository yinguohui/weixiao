package com.xihua.weixiao.entiy;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName People
 * @Auhtor ygh
 * @DATE 2019/7/12 14:01
 **/
@Component
@ConfigurationProperties(prefix = "my1")
@Data
public class People {
    private String name;
    private Integer age;
}
