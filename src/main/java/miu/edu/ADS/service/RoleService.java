package miu.edu.ADS.service;


import miu.edu.ADS.model.Role;

public interface RoleService {

	Integer createNewRole(Role roel);
	
	Role findRoleById(Integer roleId);
	
	Role updateExistingRole(Role role);
	
	Integer deleteRole(Integer roleId);
}
