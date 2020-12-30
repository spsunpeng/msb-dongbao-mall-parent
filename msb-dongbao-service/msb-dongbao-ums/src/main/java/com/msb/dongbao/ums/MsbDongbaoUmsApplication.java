package com.msb.dongbao.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunpeng
 * @Date 2020-12-24 16:58
 */
@SpringBootApplication
@MapperScan("com.msb.msbdongbaoums.mapper")
public class MsbDongbaoUmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoUmsApplication.class, args);
    }
}
