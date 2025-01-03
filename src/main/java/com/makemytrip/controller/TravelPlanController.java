package com.makemytrip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.makemytrip.entity.TravelPlan;
import com.makemytrip.service.TravelPlanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("travelplan/api")
public class TravelPlanController {
	
	@Autowired
	private TravelPlanService travelPlanService;
	
	
	@PostMapping("/register")
	public ResponseEntity<String> addTravePlan(@RequestBody TravelPlan travelPlan){
		String travelResponse =	travelPlanService.registerTravelPlan(travelPlan);
		return new ResponseEntity<String>(travelResponse, HttpStatus.CREATED);
	}
	
	@GetMapping("/get-all-travelplan")
	public ResponseEntity<?> getAllTravelPlan(){
		try {
			List<TravelPlan> listOfAllPlan = travelPlanService.showAllTravelPlan();
			return new ResponseEntity<List<TravelPlan>>(listOfAllPlan, HttpStatus.CREATED);
		}
		catch(Exception e){
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/delete-plan")
	public String deleTravelPlan(@PathVariable Long id ){
		return null;
	}
	
	@GetMapping("/edit-plan")
	public ResponseEntity<TravelPlan> modifyPlan(){
		return null; 
	}
	
	@GetMapping("/get-travelplanbyid/{planid}")
	public ResponseEntity<TravelPlan> getTravelPlanById(@PathVariable Long planid){
		try {
			TravelPlan travelPlan = travelPlanService.showTravelPlanById(planid);
			return new ResponseEntity<TravelPlan>(travelPlan, HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
