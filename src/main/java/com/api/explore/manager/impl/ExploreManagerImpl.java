package com.api.explore.manager.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.explore.dao.TagDAO;
import com.api.explore.dao.TagToPlaylistDAO;
import com.api.explore.entities.TagToPlaylist;
import com.api.explore.entities.Tags;
import com.api.explore.manager.ExploreManager;

public class ExploreManagerImpl implements ExploreManager {
	
	@Autowired
	private TagDAO tagDAO;
	
	@Autowired
	private TagToPlaylistDAO tagToPlaylistDAO;

	@Override
	public List<TagToPlaylist> getPlaylistsByTag(String tags) {
		String [] tagList = tags.split("+");
		List<Tags> tagEntityList = tagDAO.getTagsByName(Arrays.asList(tagList));
		List<String> tagIdList = new ArrayList<String>();
		for (Tags tag : tagEntityList) {
			tagIdList.add(tag.getTagId());
		}
		if (tagIdList.size() > 0) {
			List<TagToPlaylist> result = tagToPlaylistDAO.searchPlaylistsByTags(tagIdList);
			return rearrangeBasedOnLikesAndPlays(result);
		} else {
			return Collections.emptyList();
		}
	}

	private List<TagToPlaylist> rearrangeBasedOnLikesAndPlays(List<TagToPlaylist> result) {
		// TODO Auto-generated method stub
		return result;
	}

}
