package com.api.explore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tracks")
public class Tracks {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name="track_id")
	private String trackId;
	
	@Column(name="track_name")
	private String trackName;
	
	@Column(name="track_url")
	private String trackUrl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTrackId() {
		return trackId;
	}

	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}

	public String getTrackName() {
		return trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getTrackUrl() {
		return trackUrl;
	}

	public void setTrackUrl(String trackUrl) {
		this.trackUrl = trackUrl;
	}

	@Override
	public String toString() {
		return "Tracks [id=" + id + ", trackId=" + trackId + ", trackName=" + trackName + ", trackUrl=" + trackUrl
				+ "]";
	}
}
