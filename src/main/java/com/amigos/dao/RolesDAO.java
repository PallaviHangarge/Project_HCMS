package com.amigos.dao;

import java.util.List;

import com.amigos.entities.Roles;

public interface RolesDAO {
	List<Roles> getAllRoles();
	void addRoles(Roles role);
	void updateRoles(Roles role);
	void deleteRoles(int role);

	Roles getRolesById(int roleId);
}
