package com.cg.healthify.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	
	protected EntityManagerFactory emf=Persistence.createEntityManagerFactory("nutritionapp");  
    protected EntityManager em=emf.createEntityManager();
}
