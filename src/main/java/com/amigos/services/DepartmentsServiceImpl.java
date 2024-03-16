package com.amigos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amigos.dao.DepartmentsDAO;
import com.amigos.dao.EmployeesDAO;
import com.amigos.entities.Departments;
import com.amigos.entities.Employees;

import jakarta.transaction.Transactional;
@Service
public class DepartmentsServiceImpl implements DepartmentsService{
@Autowired
private DepartmentsDAO departmentsDAO;

@Override
public List<Departments> getAllDepartments() {
	return departmentsDAO.getAllDepartments();
}



@Override
public void addDepartment(Departments department) {
	departmentsDAO.addDepartments(department);
	
}



}
