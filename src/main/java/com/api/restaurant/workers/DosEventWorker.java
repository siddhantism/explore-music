//package com.api.restaurant.workers;
//
//import java.io.IOException;
//
//import org.codehaus.jackson.JsonParseException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;
//import org.springframework.amqp.core.Message;
//import org.springframework.amqp.core.MessageListener;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.api.restaurant.action.ActionManager;
//import com.api.restaurant.entities.SeverityRuleEntity;
//import com.api.restaurant.events.DosEvent;
//import com.api.restaurant.severity.SeverityManager;
//
//
//
//public class DosEventWorker implements MessageListener{
//	
//	private static ObjectMapper mapper = new ObjectMapper();
//	
//	@Autowired
//	private SeverityManager severityManager;
//	
//	@Autowired
//	private ActionManager actionManager;
//
//	@Override
//	public void onMessage(Message message) {
//		try {
//			DosEvent event = mapper.readValue(message.getBody(), DosEvent.class);
//			SeverityRuleEntity severityRuleEntity = severityManager.getSeverity(event);
//			actionManager.doAction(severityRuleEntity, event);
//		} catch (JsonParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		
//	}
//
//}
