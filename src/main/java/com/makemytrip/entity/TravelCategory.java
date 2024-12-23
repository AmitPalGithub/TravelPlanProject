package com.makemytrip.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="PLAN_CATEGORY")
public class TravelCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long categoryId;
	@Column
	private String categoryName;
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

	
}
