package com.api.explore.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "playlist_info")
public class PlaylistInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "playlist_id")
	private String playlistId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "likes")
	private Long likes;
	
	@Column(name = "plays")
	private Long plays;
	
	@Column(name = "tracks")
	private Long tracks;
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "pid", nullable = false)
	private Set<PlaylistTagDetails> tags;
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER)
	@JoinColumn(name = "pid", nullable = false)
	private Set<PlaylistTrackDetails> trackDetails;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(String playlistId) {
		this.playlistId = playlistId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLikes() {
		return likes;
	}

	public void setLikes(Long likes) {
		this.likes = likes;
	}

	public Long getPlays() {
		return plays;
	}

	public void setPlays(Long plays) {
		this.plays = plays;
	}

	public Long getTracks() {
		return tracks;
	}

	public void setTracks(Long tracks) {
		this.tracks = tracks;
	}

	public Set<PlaylistTagDetails> getTags() {
		return tags;
	}

	public void setTags(Set<PlaylistTagDetails> tags) {
		this.tags = tags;
	}

	public Set<PlaylistTrackDetails> getTrackDetails() {
		return trackDetails;
	}

	public void setTrackDetails(Set<PlaylistTrackDetails> trackDetails) {
		this.trackDetails = trackDetails;
	}

	@Override
	public String toString() {
		return "PlaylistInfo [id=" + id + ", playlistId=" + playlistId + ", name=" + name + ", likes=" + likes
				+ ", plays=" + plays + ", tracks=" + tracks + ", tags=" + tags + ", trackDetails=" + trackDetails + "]";
	}
}
