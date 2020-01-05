package com.dao;

import java.util.List;

import com.domain.Phone;

public interface IPhoneDao {
	
	/**
	 * 查询所有的手机
	 * @return
	 */
	List<Phone> findAllPhone();

}
