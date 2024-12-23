package com.makemytrip;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.makemytrip.dao.TravelPlanDao;
import com.makemytrip.entity.TravelPlan;
import com.makemytrip.service.TravelPlanServiceImpl;

@SpringBootApplication
public class TravelPlanApiApplication {

	public static void main(String[] args) {
	    ApplicationContext context =  SpringApplication.run(TravelPlanApiApplication.class, args);
	
//	    TravelPlanDao dao = context.getBean(TravelPlanDao.class, "travelPlanDao");
	    
//	    TravelPlan tp = new TravelPlan();
//	    tp.setPlanName("Goa 3N/4D");
//	    tp.setPlanMinBudget(25000.0);
//	    tp.setActive_sw('a');
//	    tp.setCreatedBy("Amit");
//	    tp.setUpdatedBy("Rohit");
//	    tp.setCreatedDate(LocalDate.now());
//	    tp.setUpdatedDate(LocalDate.now());
//	    dao.save(tp);
	    
//	    TravelPlan tp2 = new TravelPlan();
//	    tp2.setPlanName("Singapore 4N/5D");
//	    tp2.setPlanMinBudget(100000.0);
//	    tp2.setActive_sw('a');
//	    tp2.setCreatedBy("Amit");
//	    tp2.setUpdatedBy("Amit");
//	    tp2.setCreatedDate(LocalDate.now());
//	    tp2.setUpdatedDate(LocalDate.now());
//	    dao.save(tp2);
	    
	    
	    TravelPlanServiceImpl travelPlanServiceImpl = context.getBean(TravelPlanServiceImpl.class, "travelPlanServiceImpl");
	    
	    TravelPlan tp2 = new TravelPlan();
	    tp2.setPlanName("Singapore 4N/5D");
	    tp2.setPlanMinBudget(100000.0);
	    tp2.setActive_sw('a');
	    tp2.setCreatedBy("Amit");
	    tp2.setUpdatedBy("Amit");
	    tp2.setCreatedDate(LocalDate.now());
	    tp2.setUpdatedDate(LocalDate.now());
	    String response = travelPlanServiceImpl.registerTravelPlan(tp2);
	    System.out.println(response);
	}
}
