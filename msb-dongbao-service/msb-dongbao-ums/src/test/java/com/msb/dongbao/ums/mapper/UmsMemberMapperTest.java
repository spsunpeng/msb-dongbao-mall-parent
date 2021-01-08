package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.entity.UmsMember;
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
        t.setUsername("222");
        t.setStatus(0);
        t.setPassword("1");
        t.setNote("note");
        t.setNickName("nick");
        t.setEmail("email");
        umsMemberMapper.insert(t);
    }

    @Test
    void selectTest(){
        UmsMember umsMember1 = umsMemberMapper.selectByName("sunpeng");
        UmsMember umsMember3 = umsMemberMapper.selectById1(68);

        System.out.println(umsMember1);
    }
}
