package com.msb.msbdongbaoums.mapper;

import com.msb.msbdongbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author sunpeng
 * @Date 2020-12-24 16:57
 */
@SpringBootTest
public class UmsMemberMapperTest {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Test
    void insertTest(){
        UmsMember t = new UmsMember();
        t.setUsername("cpf");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");
        umsMemberMapper.insert(t);
    }
}
