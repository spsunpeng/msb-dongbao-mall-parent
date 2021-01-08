package com.msb.dongbao.ums.mapper;

import com.msb.dongbao.ums.entity.UmsMember;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author 孙鹏
 * @since 2020-12-28
 */
@Repository
public interface UmsMemberMapper extends BaseMapper<UmsMember> {
    public UmsMember selectByName(String name);
    public UmsMember selectById1(long id);
}
