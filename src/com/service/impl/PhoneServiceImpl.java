package com.service.impl;

import java.util.List;

import com.dao.IPhoneDao;
import com.domain.Phone;
import com.service.IPhoneService;
/**
 * �ֻ���ҵ���ʵ����
 * @author lwx
 *
 */
public class PhoneServiceImpl implements IPhoneService {

	
	private IPhoneDao phoneDao;
	
	
	
	public IPhoneDao getPhoneDao() {
		return phoneDao;
	}



	public void setPhoneDao(IPhoneDao phoneDao) {
		this.phoneDao = phoneDao;
	}



	@Override
	public List<Phone> findAllPhone() {
		// TODO Auto-generated method stub
		return phoneDao.findAllPhone();
	}

}
