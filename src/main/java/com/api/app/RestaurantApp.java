package com.api.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class RestaurantApp implements ServletContextListener {

	private static EntityManagerFactory emf;  
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		 emf = Persistence.createEntityManagerFactory("restaurant-jpa");
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		emf.close();
		
	}
	
	 public static EntityManager createEntityManager() {  
	        if (emf == null) {  
	            throw new IllegalStateException("Context is not initialized yet.");  
	        }  
	        return emf.createEntityManager();  
	    }  

}
