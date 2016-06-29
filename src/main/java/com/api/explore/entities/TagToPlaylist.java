package com.api.explore.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="tag_to_playlist")
public class TagToPlaylist {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "tag_id")
	private String tagId;
	
	@OneToOne(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, optional = true)
	@JoinColumn(name = "playlist_id")
	@Fetch(FetchMode.JOIN)
	private PlaylistInfo playlist;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}

	public PlaylistInfo getPlaylist() {
		return playlist;
	}

	public void setPlaylist(PlaylistInfo playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "TagToPlaylist [id=" + id + ", tagId=" + tagId + ", playlist=" + playlist + "]";
	}

}
