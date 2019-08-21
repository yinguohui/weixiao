package com.xihua.weixiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.xihua.**.dao")
//public class WeixiaoApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(WeixiaoApplication.class, args);
//	}
//
//}
public class WeixiaoApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){

		return application.sources(WeixiaoApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(WeixiaoApplication.class, args);
	}
}