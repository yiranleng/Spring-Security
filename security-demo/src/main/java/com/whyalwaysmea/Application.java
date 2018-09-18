package com.whyalwaysmea;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author: HanLong
 * @Date: Create in 2018/2/1 21:45
 * @Description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.whyalwaysmea")
@EnableAspectJAutoProxy
public class Application {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}