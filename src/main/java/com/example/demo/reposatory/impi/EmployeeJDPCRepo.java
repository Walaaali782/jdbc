package com.example.demo.reposatory.impi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.reposatory.EmployeeResps;

@Component
public class EmployeeJDPCRepo implements EmployeeResps  {

	@Autowired
	private JdbcTemplate jdbcTemplate ;
	
	
	@Override
	public int count() {
		
		return jdbcTemplate.queryForObject("SELECT COUNT(*) FROM employee", Integer.class);
	}

	@Override
	public Employee findbyid(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
