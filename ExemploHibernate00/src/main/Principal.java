package main;


import bean.Sistema;
import java.awt.EventQueue;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Principal {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Configuration conf = new Configuration();
                StandardServiceRegistry sr = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
                SessionFactory factory = new Configuration().buildSessionFactory(sr);
                
                Transaction transaction = null;
                
                try {
                    Session session = factory.openSession();
                    transaction = session.getTransaction();
                    transaction.begin();
                    
                    Sistema sistemaDoKleiton = new Sistema();
                    sistemaDoKleiton.setNome("Cleiton");
                    session.save(sistemaDoKleiton);
                    
                    // Insere na Tabela do Base de Dados
                    transaction.commit();
                } catch (HibernateException ex) {
                    ex.printStackTrace();
                    
                    if (transaction.isActive()) {
                        transaction.rollback();
                    }
                } finally {
                    factory.close();
                }
            }
        });
    }
}
