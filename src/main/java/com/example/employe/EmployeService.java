package com.example.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class EmployeService {
	@Autowired
	EmployeDao ed;
	public String postEmpolye(@RequestBody Employee e){
		return ed.postEmploye(e);
	}
	
	public String postAll(List <Employee> e) {
		return ed.postAll(e);
	}
	
	public Employee get(int id) {
		return ed.get(id);
	}
	
	public List <Employee> getAll() {
		return ed.getAll();
	}
	
	public String delet(int id) {
		return ed.delet(id);
	}

	public String update(Employee e) {
		return ed.update(e);
	}

	public List<Employee> getByGender(String gender) {
		List <Employee> l=ed.getAll();
		List <Employee> g=l.stream().filter(x->x.getGender().equals(gender)).toList();
		return g;
	}

	public List<Employee> getBySalary(int salary) {
		List <Employee> l=ed.getAll();
		List <Employee> s=l.stream().filter(x->x.getSalary()<salary).toList(); 
		return s;
	}
	
	public List<Employee> getName(String name) {
	    List <Employee> n=ed.getAll();
	    List <Employee> s=n.stream().filter(x->x.getName().startsWith(name)).toList();
		return s;
	}

	public List<String> getOnlyName(int salary) {
		List <Employee> n=ed.getAll();
		List<String> s=n.stream().filter(x->x.getSalary()>salary).map(y->y.getName()).toList();
		return s;
	}

	public List<Employee> getBySalary(int s1, int s2) {
		return ed.getBySalary(s1,s2);
	}

	public List<Employee> getEmployee(String g) {
		return ed.getEmploye(g);
	}

	

}
