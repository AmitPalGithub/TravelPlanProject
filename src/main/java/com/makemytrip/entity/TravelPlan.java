package com.makemytrip.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TRAVEL_PLAN")
public class TravelPlan {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long planId;
	@Column(length = 20, nullable = false)
	private String planName;
	@Column(nullable = false)
	private Double planMinBudget;
	@Column
	private Long planCategoryID;
	@Column
	private char active_sw;
	
	@Column(updatable = false, nullable = false)
	private LocalDate createdDate;
	@Column(nullable = false)
	private LocalDate updatedDate;
	@Column(updatable = false, nullable = false)
	private String createdBy;
	@Column(nullable = false)
	private String updatedBy;
	public Long getPlanId() {
		return planId;
	}
	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public Double getPlanMinBudget() {
		return planMinBudget;
	}
	public void setPlanMinBudget(Double planMinBudget) {
		this.planMinBudget = planMinBudget;
	}
	public Long getPlanCategoryID() {
		return planCategoryID;
	}
	public void setPlanCategoryID(Long planCategoryID) {
		this.planCategoryID = planCategoryID;
	}
	public char getActive_sw() {
		return active_sw;
	}
	public void setActive_sw(char active_sw) {
		this.active_sw = active_sw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	

}
