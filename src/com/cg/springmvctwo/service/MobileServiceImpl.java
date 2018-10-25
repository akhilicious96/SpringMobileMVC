package com.cg.springmvctwo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvctwo.dao.IMobileDao;
import com.cg.springmvctwo.dto.Mobile;

@Service("mobileservice")
@Transactional
public class MobileServiceImpl  implements IMobileService {

	@Autowired
	IMobileDao mobiledao;
	
	@Override
	public void addMobile(Mobile mob) {
		// TODO Auto-generated method stub
		mobiledao.addMobile(mob);
		
	}

	@Override
	public List<Mobile> showAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mobile searchMobile(int mobId) {
		// TODO Auto-generated method stub
		return null;
	}

}
