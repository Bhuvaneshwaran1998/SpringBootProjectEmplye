package com.example.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
 
@Repository
public class EmployeDao {
	@Autowired
	EmployeRepository er;
	public String postEmploye(@RequestBody Employee e) {
		er.save(e);
		return "detiles saved";
	}
	
	public String postAll(List <Employee> e) {
		er.saveAll(e);
		return "save all";
	}
	
	public Employee get(int id) {
		return er.findById(id).get();
	}
	
	public List <Employee> getAll() {
		return er.findAll();
	}
	
	public String delet(int id) {
		er.deleteById(id);
		return "Delet successfully";
	}

	public String update(Employee e) {
		er.save(e);
		return "update successfully";
	}

	public List<Employee> getBySalary(int s1, int s2) {
		return er.getBySalary(s1, s2);
	}

	public List<Employee> getEmploye(String g) {
		return er.getEmploye(g);
	}

	

	
}
