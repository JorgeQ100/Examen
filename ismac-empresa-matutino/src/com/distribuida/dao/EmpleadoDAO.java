package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Empleado;

public interface EmpleadoDAO {
		
	
	public  List<Empleado> finALL();
	
	public void add (Empleado empleado);
	
	public void up (Empleado empleado);
	
	public void dell (Empleado empleado);
	
	
	
}
