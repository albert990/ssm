package com.melvin.ssm.service;

import com.melvin.ssm.entity.User;

import java.util.List;

public interface UserService {

	List<User> getUserList(int offset, int limit);
	 
}
