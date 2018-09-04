package com.newcitysoft.study.ajaxdemo.dao;

import com.newcitysoft.study.ajaxdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author lixin.tian@renren-inc.com
 * @date 2018/9/4 15:32
 */
public interface UserDao extends JpaRepository<User, Integer> {
}
