//package com.api.restaurant.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.Table;
//
//import com.api.restaurant.enums.Action;
//import com.api.restaurant.enums.DosFrequencyLevel;
//import com.api.restaurant.enums.ServicingRateLevel;
//import com.api.restaurant.enums.SeverityLevels;
//
//@Entity
//@Table(name="action_rule_entity")
//public class ActionRuleEntity {
//	@Column(name = "id", updatable = false, nullable = false)
//	protected Long id;
//	
//	@Column(name = "severity_level")
//	@Enumerated(EnumType.ORDINAL)
//	private SeverityLevels severityLevel;
//	
//	@Column(name = "reason_id")
//	private String reasonId;
//	
//	@Column(name = "frequency")
//	@Enumerated(EnumType.ORDINAL)
//	private DosFrequencyLevel frequency;
//	
//	@Column(name = "servicing_rate")
//	@Enumerated(EnumType.ORDINAL)
//	private ServicingRateLevel servicingRateLevel;
//	
//	@Column(name = "action")
//	private Action action;
//
//	public Long getId() {
//		return id;
//	}
//
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public SeverityLevels getSeverityLevel() {
//		return severityLevel;
//	}
//
//
//	public void setSeverityLevel(SeverityLevels severityLevel) {
//		this.severityLevel = severityLevel;
//	}
//
//
//	public String getReasonId() {
//		return reasonId;
//	}
//
//
//	public void setReasonId(String reasonId) {
//		this.reasonId = reasonId;
//	}
//
//	public DosFrequencyLevel getFrequency() {
//		return frequency;
//	}
//
//
//	public void setFrequency(DosFrequencyLevel frequency) {
//		this.frequency = frequency;
//	}
//	
//	public ServicingRateLevel getServicingRateLevel() {
//		return servicingRateLevel;
//	}
//
//	public void setServicingRateLevel(ServicingRateLevel servicingRateLevel) {
//		this.servicingRateLevel = servicingRateLevel;
//	}
//
//	public Action getAction() {
//		return action;
//	}
//
//	public void setAction(Action action) {
//		this.action = action;
//	}
//
//	@Override
//	public String toString() {
//		return "ActionRuleEntity [id=" + id + ", severityLevel=" + severityLevel + ", reasonId=" + reasonId
//				+ ", frequency=" + frequency + ", servicingRateLevel=" + servicingRateLevel + ", action=" + action
//				+ "]";
//	}
//	
//	
//}
