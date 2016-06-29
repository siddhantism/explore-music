//package com.api.restaurant.entities;
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
//@Table(name = "severity_rules")
//public class SeverityRuleEntity {
//	
//	@Column(name = "id", updatable = false, nullable = false)
//	protected Long id;
//	
//	@Column(name = "reason_id")
//	private String reasonId;
//	
//	@Column(name = "time_of_denial")
//	private String timeOfDenial;
//	
//	@Column(name = "rest_popularity")
//	private String restPopularity;
//	
//	@Column(name = "severity")
//	@Enumerated(EnumType.ORDINAL)
//	private SeverityLevels severityImposed;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getReasonId() {
//		return reasonId;
//	}
//
//	public void setReasonId(String reasonId) {
//		this.reasonId = reasonId;
//	}
//
//	public String getTimeOfDenial() {
//		return timeOfDenial;
//	}
//
//	public void setTimeOfDenial(String timeOfDenial) {
//		this.timeOfDenial = timeOfDenial;
//	}
//
//	public String getRestPopularity() {
//		return restPopularity;
//	}
//
//	public void setRestPopularity(String restPopularity) {
//		this.restPopularity = restPopularity;
//	}
//
//	public SeverityLevels getSeverityImposed() {
//		return severityImposed;
//	}
//
//	public void setSeverityImposed(SeverityLevels severityImposed) {
//		this.severityImposed = severityImposed;
//	}
//
//	@Override
//	public String toString() {
//		return "SeverityRuleEntity [id=" + id + ", reasonId=" + reasonId + ", timeOfDenial=" + timeOfDenial
//				+ ", restPopularity=" + restPopularity + ", severityImposed=" + severityImposed + "]";
//	}
//
//}
