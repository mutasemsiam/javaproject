package com.axsos.javaproject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.javaproject.models.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {

	 List<Role> findAll();
	    
	 List<Role> findByName(String name);

}
