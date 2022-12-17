package com.shruteekatech.usermanagementapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shruteekatech.usermanagementapp.entities.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
