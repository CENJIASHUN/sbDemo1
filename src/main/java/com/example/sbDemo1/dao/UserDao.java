package com.example.sbDemo1.dao;

import com.example.sbDemo1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by ucmed on 2018/7/30.
 */
@Repository
public interface UserDao extends JpaRepository<User,Long> {
    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}
