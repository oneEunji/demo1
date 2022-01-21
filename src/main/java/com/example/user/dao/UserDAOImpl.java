package com.example.user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("userdao")
public class UserDAOImpl implements UserDAO {
    @Autowired JdbcTemplate jt;

    @Override
    public List<Map<String, ?>> selectAll() {

       return jt.query("select * from userAccount", (rs, rowNum) -> {
           Map<String, Object> mss = new HashMap<>();
           mss.put("seq", rs.getInt(1));
           mss.put("user", rs.getString(2));
           mss.put("message", rs.getString(3));
           return mss;
           });
        }
    }