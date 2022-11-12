package com.coolk1ng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coolk1ng.entity.User;
import org.apache.ibatis.annotations.Mapper;
/**
 * 书籍(User)Mapper
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
