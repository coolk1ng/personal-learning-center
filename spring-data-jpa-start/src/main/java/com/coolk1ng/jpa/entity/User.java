package com.coolk1ng.jpa.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户
 *
 * @author coolk1ng
 * @since 2022/9/15 01:55
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userId;

    private String name;

    private Integer age;

    private Integer gender;

    private Date birth;

    private Date createTime;

    private Date updateTime;
}
