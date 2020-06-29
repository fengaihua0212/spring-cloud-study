package com.fah.spring.cloud.study.dao;

import com.fah.spring.cloud.study.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
