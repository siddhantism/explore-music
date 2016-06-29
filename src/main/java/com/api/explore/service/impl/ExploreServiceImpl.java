package com.api.explore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.explore.entities.TagToPlaylist;
import com.api.explore.manager.ExploreManager;
import com.api.explore.service.ExploreService;
import com.api.response.SearchResponse;

public class ExploreServiceImpl implements ExploreService {
	
	@Autowired
	private ExploreManager exploreManager;

	@Override
	public List<TagToPlaylist> getPlaylistsByTag(String tags) {
		//SearchResponse response = null;
		try {
			return exploreManager.getPlaylistsByTag(tags);
		} catch (Exception e) {
			//TODO
		}
		return null;
	}

	private SearchResponse createResponse(List<TagToPlaylist> tagToPlaylists) {
		// TODO Auto-generated method stub
		return null;
	}

}
