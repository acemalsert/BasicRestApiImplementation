package com.springBootRestAPIwithWorldDB.WorldDB.DataAccess;

import java.util.List;


import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.CountryLanguage;

import com.springBootRestAPIwithWorldDB.WorldDB.Entities.Country;

@Repository  
public class HibernateCountryLanguageDal implements ICountryLanguageDal {
	
	private EntityManager entityManager;
	
	@Autowired
	public HibernateCountryLanguageDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional 
	public List<CountryLanguage> getAll() {
		
		Session session =entityManager.unwrap(Session.class); 
		List<CountryLanguage> countryLanguages = session.createQuery("from CountryLanguage",CountryLanguage.class).getResultList();	
		return countryLanguages;
	}

	@Override
	@Transactional 
	public void add(CountryLanguage countryLanguage) {
		Session session =entityManager.unwrap(Session.class);
		session.saveOrUpdate(countryLanguage);
		
	}

	@Override
	@Transactional 
	public void update(CountryLanguage countryLanguage) {
		Session session =entityManager.unwrap(Session.class);
		session.saveOrUpdate(countryLanguage);
		
	}

	@Override
	@Transactional 
	public void delete(CountryLanguage countryLanguage) {
		Session session =entityManager.unwrap(Session.class);
		//CountryLanguage countryLanguageToDelete = session.get(Country.class,countryLanguage.getLanguage()); ??
		//session.delete(countryLanguageToDelete);
		
	}
}
