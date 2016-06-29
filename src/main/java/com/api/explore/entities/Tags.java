package com.api.explore.entities;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Table(name="tags")
public class Tags {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name="tag_id")
	private String tagId;
	
	@Column(name="tag")
	private String tag;

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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return "Tags [id=" + id + ", tagId=" + tagId + ", tag=" + tag + "]";
	}

}
