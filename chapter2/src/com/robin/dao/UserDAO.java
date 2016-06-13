package com.robin.dao;

import com.robin.bean.User;

public interface UserDAO {
	public int getMatchCount(String userName,String password);
	public User findUserByUserName(final String userName);
	public void updateLoginInfo(User user);
}
