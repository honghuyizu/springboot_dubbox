package com.dubbox.rsfservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * 应用入口：
 * 1.用main方法，可以在开发时，启动一个内嵌的Web服务器
 * 2.继承SpringBootServletInitializer，部署到Web服务器时，会自动执行onStartup()方法
 * @author Administrator
 * 2015-12-01
 */
@SpringBootApplication
@Slf4j
public class RsfserviceMain extends org.springframework.boot.web.support.SpringBootServletInitializer {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(RsfserviceMain.class, args);
        log.debug("---------------------" + RsfserviceMain.class.getName() + "-----------------------");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(RsfserviceMain.class);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        log.debug("---------------------" + this.getClass().getName() + "-----------------------");
    }
}