package com.shruteekatech.usermanagementapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruteekatech.usermanagementapp.entities.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer>{
	
	public List<City> findByStateId(int state_Id);

}
