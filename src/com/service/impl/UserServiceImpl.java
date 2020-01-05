package com.service.impl;

import com.dao.IUserDao;
import com.domain.User;


import com.service.IUserService;
/**
 * 用户的业务层实现类
 * @author lwx
 *
 */
public class UserServiceImpl implements IUserService {
	
	private IUserDao userDao;
	
	

	public IUserDao getUserDao() {
		return userDao;
	}



	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}



	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userDao.saveUser(user);

	}

}
