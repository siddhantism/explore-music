//package com.api.restaurant.entities;
//
//import java.util.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.Table;
//
//import com.api.restaurant.enums.SeverityLevels;
//
//@Entity
//@Table(name="restaurant_severity_log")
//public class RestaurantDOSSeverityLogEntity {
//	@Column(name = "id", updatable = false, nullable = false)
//	protected Long id;
//	
//	@Column(name = "restaurant_id")
//	private String resturantId;
//	
//	@Column(name = "severity_level")
//	@Enumerated(EnumType.ORDINAL)
//	private SeverityLevels severityLevel;
//	
//	@Column(name = "created_on")
//	private Date createdOn;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getResturantId() {
//		return resturantId;
//	}
//
//	public void setResturantId(String resturantId) {
//		this.resturantId = resturantId;
//	}
//
//	public SeverityLevels getSeverityLevel() {
//		return severityLevel;
//	}
//
//	public void setSeverityLevel(SeverityLevels severityLevel) {
//		this.severityLevel = severityLevel;
//	}
//
//	public Date getCreatedOn() {
//		return createdOn;
//	}
//
//	public void setCreatedOn(Date createdOn) {
//		this.createdOn = createdOn;
//	}
//	
//	@Override
//	public String toString() {
//		return "RestaurantSeverityLogEntity [id=" + id + ", resturantId=" + resturantId + ", severityLevel="
//				+ severityLevel + ", createdOn=" + createdOn + "]";
//	}
//
//
//}
