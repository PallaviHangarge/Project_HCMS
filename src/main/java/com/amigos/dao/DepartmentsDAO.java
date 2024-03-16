package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Departments;
import com.amigos.entities.Roles;

public interface DepartmentsDAO {
	List<Departments> getAllDepartments();
	void addDepartments(Departments department);
}
