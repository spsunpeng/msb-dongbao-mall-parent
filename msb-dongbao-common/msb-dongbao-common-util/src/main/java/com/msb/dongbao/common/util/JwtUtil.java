package com.msb.dongbao.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author sunpeng
 * @Date 2021-01-20 9:21
 */
public class JwtUtil {

    private static final String secret = "abcdef";

    /**
     * 生成token
     * @param subject
     * @return
     */
    public static String createToken(String subject){

        String token = Jwts.builder().setSubject(subject)
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 1))
                .signWith(SignatureAlgorithm.HS256, secret)
                .compact();

        return token;
    }

    /**
     * 识别token
     * @param token
     * @return
     */
    public static String parseToken(String token){
        Claims body = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
        String subject = body.getSubject();
        return subject;
    }

    /*
    测试
     */
    public static void main(String[] args) throws InterruptedException {
        String name = "孙鹏";
        String token = createToken(name);
        System.out.println(token);

        TimeUnit.SECONDS.sleep(2);

        String subject = parseToken(token);
        System.out.println(subject);
    }
}
