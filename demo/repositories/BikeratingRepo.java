package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.BikeRating;

@Repository
public interface BikeratingRepo extends CrudRepository<BikeRating, Integer>
{

}
