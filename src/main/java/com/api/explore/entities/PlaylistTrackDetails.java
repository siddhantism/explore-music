package com.api.explore.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="playlist_tracks")
public class PlaylistTrackDetails {
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, insertable = false)
	private Long id;

	@Column(name = "pid", insertable = false, updatable = false)
	private Long pid;

	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "track_id", insertable = true, nullable = true)
	@Fetch(FetchMode.JOIN)
	private Tracks track;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "pid", insertable = false, updatable = false, nullable = false)
	@JsonIgnore
	@com.fasterxml.jackson.annotation.JsonIgnore
	private PlaylistInfo playlistInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Tracks getTrack() {
		return track;
	}

	public void setTrack(Tracks track) {
		this.track = track;
	}

	public PlaylistInfo getPlaylistInfo() {
		return playlistInfo;
	}

	public void setPlaylistInfo(PlaylistInfo playlistInfo) {
		this.playlistInfo = playlistInfo;
	}

	@Override
	public String toString() {
		return "PlaylistTrackDetails [id=" + id + ", pid=" + pid + ", track=" + track + "]";
	}
}
