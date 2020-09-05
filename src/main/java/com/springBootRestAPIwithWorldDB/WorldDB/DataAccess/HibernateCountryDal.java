package com.springBootRestAPIwithWorldDB.WorldDB.DataAccess;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.City;
import com.springBootRestAPIwithWorldDB.WorldDB.Entities.Country;


@Repository  
public class HibernateCountryDal implements ICountryDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryDal(EntityManager entitiyManager) {
		this.entityManager = entitiyManager;
	}

	@Override
	@Transactional 
	public List<Country> getAll() {
		Session session =entityManager.unwrap(Session.class); 
		List<Country> countries  = session.createQuery("from Country",Country.class).getResultList();
		return countries;
	}

	@Override
	@Transactional 
	public void add(Country country) {
		Session session =entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	@Transactional 
	public void update(Country country) {
		Session session =entityManager.unwrap(Session.class);
		session.saveOrUpdate(country);
		
	}

	@Override
	@Transactional 
	public void delete(Country country) {
		Session session =entityManager.unwrap(Session.class);
		Country countryToDelete = session.get(Country.class, country.getCode());
		session.delete(countryToDelete);
		
	} 
}
