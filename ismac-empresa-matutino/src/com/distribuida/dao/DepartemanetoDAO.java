package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Departamento;

public interface DepartemanetoDAO {
	
	
	public List<Departamento> finALL();
	
	public void add (Departamento departamento);
	public void up (Departamento departamento);
	public void dell (Departamento departamento);

}
