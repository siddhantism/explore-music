package com.api.explore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.codehaus.jackson.annotate.JsonIgnore;

@Entity
@Table(name = "playlist_tags")
public class PlaylistTagDetails {
	@Id
	@GeneratedValue
	@Column(name = "id", updatable = false, insertable = false)
	private Long id;

	@Column(name = "pid", insertable = false, updatable = false)
	private Long pid;

	@NotNull
	@Column(name = "tag")
	private String tag;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "uid", insertable = false, updatable = false, nullable = false)
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public PlaylistInfo getPlaylistInfo() {
		return playlistInfo;
	}

	public void setPlaylistInfo(PlaylistInfo playlistInfo) {
		this.playlistInfo = playlistInfo;
	}

	@Override
	public String toString() {
		return "TagDetails [id=" + id + ", pid=" + pid + ", tag=" + tag + ", playlistInfo=" + playlistInfo + "]";
	}
}
