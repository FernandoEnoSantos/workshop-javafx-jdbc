package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		
		//DADOS MOCKADOS == DE MENTIRINHA, AINDA NÃO TEMOS BANCO E NEM SUA CONEXÃO
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"Livros"));
		list.add(new Department(2,"Computers"));
		list.add( new Department(3,"Electronics") );
		
		return list;
	}

}
