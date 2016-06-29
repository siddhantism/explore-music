//package com.api.restaurant.severity;
//
//import java.util.Date;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.api.restaurant.dao.RestaurantPopularityDAO;
//import com.api.restaurant.dao.SeverityRuleDAO;
//import com.api.restaurant.entities.RestaurantPopularityEntity;
//import com.api.restaurant.entities.SeverityRuleEntity;
//import com.api.restaurant.enums.RestaurantPopularity;
//import com.api.restaurant.enums.SeverityLevels;
//import com.api.restaurant.enums.TimeofDenialPeak;
//import com.api.restaurant.events.DosEvent;
//
//public class SeverityManager {
//	
//	@Autowired
//	private SeverityRuleDAO severityRuleDAO;
//	@Autowired
//	private RestaurantPopularityDAO restaurantPopularityDAO;
//	
//	public SeverityRuleEntity getSeverity(DosEvent event) {
//		String reasonId = event.getDosReasonId();
//		Date dosCreatedOn = event.getDosCreatedOn();
//		String itemId = event.getItemId();
//		String restaurantId = event.getRestaurantId();
//		String timeOfDenial = fetchTimeOfDenial(dosCreatedOn);
//		String restaurantPopularity = fetchResturantPopularity(restaurantId);
//		SeverityRuleEntity entity = severityRuleDAO.getSeverityRuleEntity(reasonId, timeOfDenial, restaurantPopularity);
//		logDOSForRestaurant(restaurantId, entity.getSeverityImposed(), dosCreatedOn);
//		return entity;
//		
//	}
//
//	//log dos for restaurant with date. helps in knowing how frequent is dos
//	private void logDOSForRestaurant(String restaurantId, SeverityLevels severityLevel, Date dosCreatedOn) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private String fetchResturantPopularity(String restaurantId) {
//		RestaurantPopularityEntity entity = restaurantPopularityDAO.getRestaurnantPopularScore(restaurantId);
//		String popularityScore = entity.getPopularityScore();
//		//logic to find popularity score and categorize them into HIGH, LOW, MEDIUM
//		return RestaurantPopularity.HIGH.toString();
//	}
//
//	
//	private String fetchTimeOfDenial(Date dosCreatedOn) {
//		int hour = dosCreatedOn.getHours();
//		int minute = dosCreatedOn.getMinutes();
//		//logic to find if START of peak, MIDDLE of peak, END of peak, LEAN period
//		return TimeofDenialPeak.MIDDLE.toString();
//	}
//}
