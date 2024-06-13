package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Subordinado;

public interface SubordinadoDAO {

	public List<Subordinado> finALL();
	
	public void add (Subordinado subordinado );
	public void up (Subordinado subordinado );
	public void dell (Subordinado subordinado );
	
}
