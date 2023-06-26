package com.example.employe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

@RestController
public class EmployeController {
	@Autowired
	EmployeService es;
	
	//curd opration
	@PostMapping(value="/post")
	public String postEmploye(@RequestBody Employee e) {
		return es.postEmpolye(e);
	}
	
	@PostMapping(value="/postAll")
	public String postAll(@RequestBody List <Employee> e) {
		return es.postAll(e);
	}
	
	@GetMapping(value="/getById/{id}")
	public Employee get(@PathVariable int id) {
		return es.get(id);
	}
	
	@GetMapping(value="/getAll")
	public List <Employee> getAll() {
		return es.getAll();
	}
	
	@DeleteMapping(value="/deletById/{id}")
	public String delet(@PathVariable int id) {
		return es.delet(id);
	}
	
	@PutMapping(value="/update/{e}")
	public String update(@RequestBody Employee e) {
		return es.update(e);
	}
	
	//own methods
	@GetMapping(value="/getByGender/{gender}")
	public List<Employee> getByGenderMethod(@PathVariable String gender){
		return es.getByGender(gender);
	}
	
	@GetMapping(value="/getBySalary/{salary}")
	public List<Employee> getBySalary(@PathVariable int salary){
		return es.getBySalary(salary);
	}
	
	@GetMapping(value="/getNameList/{name}")
	public List<Employee> getName(@PathVariable String name){
		return es.getName(name); 
	}
	
	@GetMapping(value="/onlyName/{salary}")
	public List<String> getName(@PathVariable int salary){
		return es.getOnlyName(salary);
	}
	
	@GetMapping(value="/inbetweenSalary/{s1}/{s2}")
	public List<Employee> getBySalary(@PathVariable int s1, @PathVariable int s2){
		return es.getBySalary(s1,s2);
	}
	
	@GetMapping(value="/getEmployee/{g}")
	public List<Employee> getEmploye(@RequestBody String g){
		return es.getEmployee(g);
	}
	
	

}
