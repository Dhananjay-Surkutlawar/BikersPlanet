package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Companies;

@Repository

public interface CompaniesRepo extends CrudRepository<Companies, Integer> {

}
