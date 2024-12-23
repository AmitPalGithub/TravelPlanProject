package com.makemytrip.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.makemytrip.entity.TravelPlan;

public interface TravelPlanService {
	
	
	//Save Operation
	public String registerTravelPlan(TravelPlan travelPlan);
	
	//Selection Operation
	public List<TravelPlan> showAllTravelPlan();
	
	//For single selection 
	public TravelPlan showTravelPlanById(Long planId);
	
	//Update Operation
	public String updateTravelPlan(TravelPlan travelPlan);
	
	//Delete Operation
	public String deleteTravelPlan(Long planId);
	
	public Map<Integer, String> getTravelPlanCategories();

}
