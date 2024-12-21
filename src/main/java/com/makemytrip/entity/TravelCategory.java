package com.makemytrip.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="plan_category")
public class TravelCategory {
	
	
	private Long categoryId;
	private String categoryName;
	private char active_sw;
	
	private LocalDate createdDate;
	private LocalDate updatedDate;
	private String createdBy;
	private String updatedBy;

	
}
