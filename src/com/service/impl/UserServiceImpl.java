package com.service.impl;

import com.dao.IUserDao;
import com.domain.User;


import com.service.IUserService;
/**
 * �û���ҵ���ʵ����
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
