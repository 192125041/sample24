package learn.hiber;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;
public class App {
    public static void main(String[] args) {
    	//Student st=new Student(9, "janu", "redFlower", 2009);
        Configuration cfg = new Configuration()
            .setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
            .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/j2ee")
            .setProperty("hibernate.connection.username", "root")
            .setProperty("hibernate.connection.password", "4447")
            .setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect")
            .setProperty("hibernate.hbm2ddl.auto", "update")
            .setProperty("hibernate.show_sql", "true")
            .addAnnotatedClass(Student.class);

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession(); 
        Transaction tx=session.beginTransaction();
        Person p1=new Person();
        AdharCard ac= new AdharCard(111,"sai","baglore","male",p1);
        p1.setId(101);
        p1.setNickName("venu");
        p1.setCard(ac);
        session.persist(p1);
        session.persist(ac);
        tx.commit();
        session.close();	
        factory.close();
    }
}
