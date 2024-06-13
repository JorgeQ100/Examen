package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DepartemanetoDAO;
import com.distribuida.entities.Departamento;

public class PrincipalDepartamendo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DepartemanetoDAO departemanetoDAO = context.getBean("departementoDAOImpl", DepartemanetoDAO.class); 
		
		List<Departamento> departamento =  departemanetoDAO.finALL();
		
		departamento.forEach(item ->{
			
			System.out.println(item.toString());
			
		});

	}

}
