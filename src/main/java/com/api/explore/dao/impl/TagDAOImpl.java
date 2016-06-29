package com.api.explore.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.api.explore.dao.TagDAO;
import com.api.explore.entities.TagToPlaylist;
import com.api.explore.entities.Tags;

public class TagDAOImpl implements TagDAO {
	
	protected EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Tags> getTagsByName(List<String> tags) {
		try {
			Query query = getEntityManager()
					.createQuery("Select o from Tags o where tag in (:tags)", Tags.class)
					.setParameter("tags", tags);
			@SuppressWarnings("unchecked")
			List<Tags> resultList = (List<Tags>) query.getResultList();
			return resultList;
		} catch (NoResultException e) {
		} catch (Exception e) {
			throw new RuntimeException("Error in fetching tags");
		}
		return null;
	}

}
