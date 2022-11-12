package com.coolk1ng.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 书籍(User)Entity
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("tb_user")
public class User extends Model<User> {
    //主键ID（全局唯一）
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;
    //姓名
    private String userName;
    //部门ID
    private Long deptId;


    public User(User user) {
        if (user != null) {
            this.userId = user.userId;
            this.userName = user.userName;
            this.deptId = user.deptId;
        }
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.userId;
    }
    }
