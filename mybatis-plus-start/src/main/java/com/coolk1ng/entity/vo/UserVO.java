package com.coolk1ng.entity.vo;

import com.coolk1ng.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserVO
 *
 * @author coolk1ng
 * @since 2022/10/29 21:31
 */
@Data
@NoArgsConstructor
public class UserVO extends User {
    private String depName;

    public UserVO(User user) {
        super(user);
    }
}
