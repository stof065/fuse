package sample.bean.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sample.bean.model.Dummy;

public class DummyRepository {

	private static final Logger LOG = LoggerFactory.getLogger(DummyRepository.class);

	@PersistenceContext(unitName = "camel-hibernate-jpa")
	private EntityManager em;

	public void init() {
		LOG.info("persistence unit initialisation : {}", em == null ? "null" : em);
	}

	public List<Dummy> findAll() {
		return em.createQuery("select * from Dummy", Dummy.class).getResultList();
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

}
