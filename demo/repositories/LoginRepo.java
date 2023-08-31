package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Login;

@Repository
public interface LoginRepo extends JpaRepository<Login, Integer> 
{

	    @Query("select l from Login l where email= :email and password= :password ")
	    public Optional<Login> getLogin(String email,String password);
	    
	    
	    
	    
	    @Query("SELECT l FROM Login l ORDER BY l.id DESC LIMIT 1")
	    Login findLastEntry();
	    

	    
	    
//	    @Query("SELECT l FROM Login l ORDER BY l.id DESC LIMIT(1)")
//	    public static Login findLastEntry()
//	    {
//	    	String jpql = "SELECT l FROM Login l ORDER BY l.id DESC";
//	        List<Login> results = entityManager.createQuery(jpql, Login.class)
//	                                          .setMaxResults(1)
//	                                          .getResultList();
//	        
//	        return results.isEmpty() ? null : results.get(0);
//	    }
	
}
