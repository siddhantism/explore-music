package com.api.explore.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.api.explore.dao.TagToPlaylistDAO;
import com.api.explore.entities.TagToPlaylist;

public class TagToPlaylistDAOImpl implements TagToPlaylistDAO {
	
	protected EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<TagToPlaylist> searchPlaylistsByTags(List<String> tags) {
		try {
			Query query = getEntityManager()
					.createQuery("Select o from TagToPlaylist o where tag in (:tags)", TagToPlaylist.class)
					.setParameter("tags", tags);
			@SuppressWarnings("unchecked")
			List<TagToPlaylist> resultList = (List<TagToPlaylist>) query.getResultList();
			return resultList;
		} catch (NoResultException e) {
		} catch (Exception e) {
			throw new RuntimeException("Error in fetching playlist from tags");
		}
		return null;
	}

}
