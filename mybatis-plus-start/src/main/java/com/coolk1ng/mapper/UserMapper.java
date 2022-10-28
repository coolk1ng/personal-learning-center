package com.coolk1ng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coolk1ng.pojo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserMapper
 *
 * @author coolk1ng
 * @since 2022/9/16 01:46
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
