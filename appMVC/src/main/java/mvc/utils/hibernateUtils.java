package mvc.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class hibernateUtils {

    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {

        Configuration cfg = new Configuration();
        cfg.configure();

        if(sessionFactory == null) {
            sessionFactory = cfg.buildSessionFactory();

        }
        return sessionFactory;
    }


}
