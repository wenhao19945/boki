package com.yzsm.boki.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yzsm.boki.entity.User;
import com.yzsm.boki.mapper.UserMapper;
import com.yzsm.boki.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.mapper.selectByPrimaryKey(id);
	}

}
