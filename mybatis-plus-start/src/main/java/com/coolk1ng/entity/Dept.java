package com.coolk1ng.entity;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Optional;

/**
 * 部门(Dept)Entity
 *
 * @author coolk1ng
 * @since 2022-10-29 21:29:52
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("tb_dept")
public class Dept extends Model<Dept> {
    //主键ID（全局唯一）
    private Long deptId;
    //部门名称
    private String deptName;

    public Dept(Dept dept) {
        Optional.ofNullable(dept).ifPresent(item -> {
            this.deptId = dept.deptId;
            this.deptName = dept.deptName;
        });
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    public Serializable pkVal() {
        return this.deptId;
    }
    }
