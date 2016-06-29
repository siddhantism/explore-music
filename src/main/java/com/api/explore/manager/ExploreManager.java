package com.api.explore.manager;

import java.util.List;

import com.api.explore.entities.TagToPlaylist;
import com.api.explore.entry.PlaylistEntry;

public interface ExploreManager {
	
	public List<TagToPlaylist> getPlaylistsByTag(String tags);

}
