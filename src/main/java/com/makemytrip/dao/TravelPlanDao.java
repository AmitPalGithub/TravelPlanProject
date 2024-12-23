package com.makemytrip.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makemytrip.entity.TravelPlan;

@Repository
public interface TravelPlanDao extends JpaRepository<TravelPlan, Long>{
	

}
