package PFT;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_util {
  private static SessionFactory sessionFactory;
  public static SessionFactory getSessionFactory() {


    if (sessionFactory == null) {
      // SessionFactory in Hibernate 5 example
      Configuration config = new Configuration();
      config.configure();
      // local SessionFactory bean created
      sessionFactory = config.buildSessionFactory();
    }
    return sessionFactory;
  }
}