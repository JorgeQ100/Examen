package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.DepartamentoDAOImpl;
import com.distribuida.dao.DepartemanetoDAO;

public class PrincipalDepartemento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		DepartemanetoDAO departemanetoDAO = context.getBean("departamentoDAOImpl", DepartamentoDAO.class);
		
		List<Departamento> departamento = departemanetoDAO.finALL();
		
		departamento.forEach(item ->{
			
			System.out.println(item.toString());
			
		});
		

	}

}
