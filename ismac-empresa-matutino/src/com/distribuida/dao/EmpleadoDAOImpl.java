package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.distribuida.entities.Empleado;


@Repository
public class EmpleadoDAOImpl implements EmpleadoDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Empleado> finALL() {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Empleado", Empleado.class).getResultList();
	}

	@Override
	public void add(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dell(Empleado empleado) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
