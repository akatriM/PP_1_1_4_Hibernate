package main.java.jm.task.core.jdbc.util;




import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class Util {
  private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "1234";
  private Connection connection;
  private SessionFactory sessionFactory;




  public Util(){
//    try {
//      connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//    } catch (SQLException e) {
//      e.printStackTrace();
//    }

    sessionFactory = new Configuration().addAnnotatedClass(User.class).buildSessionFactory();

  }

  public Connection getConnection() {
    return connection;
  }

  public SessionFactory getSessionFactory() {
    return sessionFactory;
  }
}
