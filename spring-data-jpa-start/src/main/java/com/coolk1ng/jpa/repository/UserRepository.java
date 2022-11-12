package com.coolk1ng.jpa.repository;

import com.coolk1ng.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserRepository
 *
 * @author coolk1ng
 * @since 2022/9/15 02:09
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    /**
     * 条件查询
     * @param gender
     * @return List<User>
     */
    List<User> getUserByGender(Integer gender);
}
