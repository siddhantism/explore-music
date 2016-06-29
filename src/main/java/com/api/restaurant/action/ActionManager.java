//package com.api.restaurant.action;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.api.restaurant.dao.ActionRuleDAO;
//import com.api.restaurant.entities.ActionRuleEntity;
//import com.api.restaurant.entities.SeverityRuleEntity;
//import com.api.restaurant.enums.Action;
//import com.api.restaurant.enums.DosFrequencyLevel;
//import com.api.restaurant.enums.SeverityLevels;
//import com.api.restaurant.events.DosEvent;
//
//public class ActionManager {
//	
//	@Autowired
//	private ActionRuleDAO actionDAO;
//
//	public void doAction(SeverityRuleEntity severityRuleEntity, DosEvent event) {
//		SeverityLevels severityLevel = severityRuleEntity.getSeverityImposed();
//		String reasonId = severityRuleEntity.getReasonId();
//		List<Action> actionToBeTaken = findAction(severityLevel, reasonId, event.getRestaurantId(), event.getItemId());
//		if (actionToBeTaken.size() > 0) {
//			reportActions(actionToBeTaken);
//		}
//	}
//
//	private void reportActions(List<Action> actionToBeTaken) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private List<Action> findAction(SeverityLevels severityLevel, String reasonId, String restaurantId, String itemId) {
//		List<ActionRuleEntity> entityList = actionDAO.getActionEntity(severityLevel, reasonId);
//		DosFrequencyLevel frequency = getRestaurantDOSFrequencyLevel(restaurantId);
//		List<Action> actionsToBeTaken = new ArrayList<>();
//		for (ActionRuleEntity entity : entityList) {
//			if (entity.getFrequency().equals(DosFrequencyLevel.NONE)) {
//				actionsToBeTaken.add(entity.getAction());
//			} else if (entity.getFrequency().equals(frequency)){
//				actionsToBeTaken.add(entity.getAction());
//			}
//		}
//		return actionsToBeTaken;
//	}
//
//	private DosFrequencyLevel getRestaurantDOSFrequencyLevel(String restaurantId) {
//		return null;
//		// TODO Auto-generated method stub
//		
//	}
//
//}
