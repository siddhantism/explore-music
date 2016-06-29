package com.api.explore.dao;

import java.util.List;

import com.api.explore.entities.Tags;

public interface TagDAO {

	public List<Tags> getTagsByName(List<String> tags);
}
