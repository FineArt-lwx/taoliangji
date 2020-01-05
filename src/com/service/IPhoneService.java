package com.service;

import java.util.List;

import com.domain.Phone;

/*
 * 手机的业务层接口
 */
public interface IPhoneService {
	
	/**
	 * 查询所有手机
	 * @return
	 */
	List<Phone> findAllPhone();
	
	
	
	
}
