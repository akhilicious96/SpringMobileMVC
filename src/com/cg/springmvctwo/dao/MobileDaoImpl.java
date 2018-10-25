package com.cg.springmvctwo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.springmvctwo.dto.Mobile;
@Repository("mobiledao")
public class MobileDaoImpl implements IMobileDao {

	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public void addMobile(Mobile mob) {
		// TODO Auto-generated method stub
		
		em.persist(mob);
		em.flush();
		
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
