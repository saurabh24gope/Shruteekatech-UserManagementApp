package com.shruteekatech.usermanagementapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruteekatech.usermanagementapp.entities.State;
@Repository
public interface StateRepository extends JpaRepository<State,Integer>{
	
	public List<State> findByCountryId(int countryId);

}
