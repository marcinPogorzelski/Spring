package com.mp.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HbUtils {
	static final Logger LOGGER = Logger.getLogger(HbUtils.class);

	public static SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = null;
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			LOGGER.info("Plik konfiguracji <<hibernate.cfg.xml>> został załadowany. ");

			StandardServiceRegistryBuilder serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			LOGGER.info("serviceRegistry - skonfigurowano.");

			sessionFactory = configuration.buildSessionFactory(serviceRegistry.build());
			LOGGER.info("sessionFactory - skonfigurowano.");
			
		} catch (HibernateException e) {
			LOGGER.warn("Coś poszło nie tak.");
			e.printStackTrace();
		}
		return sessionFactory;
	}

	public static void createGuest(HbGuest hbGuest) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(hbGuest);
		session.getTransaction().commit();
		session.close();
		LOGGER.info("Obiekt " + hbGuest.toString() + " został zapisany w bazie danych.");
	}

}
