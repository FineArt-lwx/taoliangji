package com.dao;

import java.util.List;

import com.domain.Phone;

public interface IPhoneDao {
	
	/**
	 * ��ѯ���е��ֻ�
	 * @return
	 */
	List<Phone> findAllPhone();

}
