package com.coolk1ng.entity.vo;

import com.coolk1ng.entity.Dept;
import com.coolk1ng.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * DeptVO
 *
 * @author coolk1ng
 * @since 2022/10/29 21:35
 */
@Data
@NoArgsConstructor
public class DeptVO extends Dept {
    List<User> userList;

    public DeptVO(Dept dept) {
        super(dept);
    }
}
