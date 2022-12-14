package com.shruteekatech.usermanagementapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruteekatech.usermanagementapp.entities.UserAccountEntity;
@Repository
public interface UserRepository extends JpaRepository<UserAccountEntity, Integer>{
	
	public UserAccountEntity findByEmailAndPassword(String email,String password);
	
	public UserAccountEntity findByEmail(String email);


}
