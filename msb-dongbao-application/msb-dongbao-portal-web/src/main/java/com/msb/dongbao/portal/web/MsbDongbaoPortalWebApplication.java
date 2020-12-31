package com.msb.dongbao.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunpeng
 * @Date 2020-12-30 14:45
 */
@SpringBootApplication(scanBasePackages = {"com.msb.dongbao.ums", "com.msb.dongbao.portal"})
@MapperScan("com.msb.dongbao.ums.mapper")
public class MsbDongbaoPortalWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoPortalWebApplication.class, args);
    }
}
