package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.SubordinadoDAO;
import com.distribuida.entities.Subordinado;

public class PrinciplaSubordinado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		SubordinadoDAO subordinadoDAO = context.getBean("subordinadoDAOImpl", SubordinadoDAO.class);
		
		List<Subordinado> subordinados = subordinadoDAO.finALL();
		
		subordinados.forEach(item ->{
			
			System.out.println(item.toString());
			
		});
		
		

	}

}
