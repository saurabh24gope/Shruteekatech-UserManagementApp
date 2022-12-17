package com.shruteekatech.usermanagementapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruteekatech.usermanagementapp.entities.UserAccountEntity;

public interface UserRepository extends JpaRepository<UserAccountEntity, Integer>{

}
