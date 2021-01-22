package com.pramodya.hfms.repository.impl;

import com.pramodya.hfms.repository.QueryRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class QueryDAOImpl implements QueryRepository {

    @PersistenceContext
    private EntityManager entityManager;


}
