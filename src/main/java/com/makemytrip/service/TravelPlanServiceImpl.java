package com.makemytrip.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makemytrip.dao.TravelPlanDao;
import com.makemytrip.entity.TravelPlan;


@Service
public class TravelPlanServiceImpl implements TravelPlanService {
	
	@Autowired
	private TravelPlanDao travelPlanDao;

	@Override
	public String registerTravelPlan(TravelPlan travelPlan) {
		TravelPlan tp =	travelPlanDao.save(travelPlan);
		
		if(tp!=null) {
			return "Travel Plan is registered with id "+ tp.getPlanId();
		}
		return "Travel Plan is not registered" ;
	}

	@Override
	public List<TravelPlan> showAllTravelPlan() {
		return travelPlanDao.findAll();
	}

	@Override
	public TravelPlan showTravelPlanById(Long planId) {
		Optional<TravelPlan> travelPlan = travelPlanDao.findById(planId);
		
		if(travelPlan.isPresent())
			return travelPlan.get();
		else
			throw new IllegalArgumentException("planId is not found");
	}

	@Override
	public String updateTravelPlan(TravelPlan travelPlan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTravelPlan(Long planId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getTravelPlanCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
