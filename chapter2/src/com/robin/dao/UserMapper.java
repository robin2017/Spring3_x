package com.robin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.robin.bean.User;

 

public class UserMapper implements RowMapper<User> {
	   public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		   User user = new User();
		   user.setCredits(rs.getInt("credits"));
		   user.setLastIp(rs.getString(""));
		   user.setLastVisit();
		   user.setPassword();
		   user.setUserId();
		   user.setUserName();
		   
		   
		   user.setId(rs.getInt("id"));
		   user.setName(rs.getString("name"));
	      user.setAge(rs.getInt("age"));
	      return user;
	   }
	}