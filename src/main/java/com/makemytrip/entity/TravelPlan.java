package com.makemytrip.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRAVEL_PLAN")
public class TravelPlan {
	
	
	private Long planId;
	private String planName;
	private Double planMinBudget;
	private Long planCaegoryID;
	private char active_sw;
	
	
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String createdBy;
	private String updatedBy;

}
