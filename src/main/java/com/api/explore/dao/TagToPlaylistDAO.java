package com.api.explore.dao;

import java.util.List;

import com.api.explore.entities.PlaylistInfo;
import com.api.explore.entities.TagToPlaylist;

public interface TagToPlaylistDAO {
	
	List<TagToPlaylist> searchPlaylistsByTags(List<String> tags);

}
