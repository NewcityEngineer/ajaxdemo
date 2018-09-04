package com.newcitysoft.study.ajaxdemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Servlet初始化器
 * 注：若不用SpringBoot整合tomcat，才需要此类。
 *
 * @author lixin.tian@renren-inc.com
 * @date 2018/5/31 16:11
 */
public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AjaxDemoApplication.class);
    }
}
