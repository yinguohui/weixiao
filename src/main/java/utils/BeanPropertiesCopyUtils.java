package utils;

import com.xihua.weixiao.entiy.People;
import com.xihua.weixiao.entiy.PeopleCopy;
import org.springframework.beans.BeanUtils;

/**
 * @author ：ganjie
 * @description：实体类属性copy工具，返回目的类
 * @date ：Created in 2019-07-21 22:04
 * @modified By：
 */
public class BeanPropertiesCopyUtils {
    public static <T> T copyProperties(Object res,T des){
        BeanUtils.copyProperties(res,des);
        return des;
    }

    public static void main(String[] args) {
        People A = new People();
        A.setAge(12);
        A.setName("淫秽");
        System.out.println(BeanPropertiesCopyUtils.copyProperties(A,new PeopleCopy()));
    }
}
