//package com.api.restaurant.entities;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="restaurant_popularity")
//public class RestaurantPopularityEntity {
//	
//	@Column(name = "id", updatable = false, nullable = false)
//	protected Long id;
//	
//	@Column(name = "restaurant_id")
//	private String resturantId;
//	
//	@Column(name = "popularityScore")
//	private String popularityScore;
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
//	public String getPopularityScore() {
//		return popularityScore;
//	}
//
//	public void setPopularityScore(String popularityScore) {
//		this.popularityScore = popularityScore;
//	}
//
//	@Override
//	public String toString() {
//		return "RestaurantPopularityEntity [id=" + id + ", resturantId=" + resturantId + ", popularityScore="
//				+ popularityScore + "]";
//	}
//}
