package com.example.employe;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeRepository extends  JpaRepository<Employee,Integer> {
	
	 @Query(value="Select * from employe_table where salary>=? and salary<=?",nativeQuery=true)
	 public List<Employee> getBySalary(int salary1, int salary2);
	 
	 @Query(value ="Select * from employe_table where gender like ?",nativeQuery = true)
	 public List<Employee> getEmploye(String gender);

}
