package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Subordinado;

@Repository
public class SubordinadoDAOImpl implements SubordinadoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Subordinado> finALL() {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession(); 
		return session.createQuery("from Subordinado", Subordinado.class).getResultList();
	}

	@Override
	public void add(Subordinado subordinado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Subordinado subordinado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(Subordinado subordinado) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
