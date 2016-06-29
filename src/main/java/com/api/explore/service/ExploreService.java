package com.api.explore.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.api.explore.entities.TagToPlaylist;

@Path("explore")
public interface ExploreService {
		
	@GET
	@Path("explore/{tags}")
	@Produces("application/json")
	@Consumes("application/json")
	public List<TagToPlaylist> getPlaylistsByTag(@PathParam("tags") String tags);

}