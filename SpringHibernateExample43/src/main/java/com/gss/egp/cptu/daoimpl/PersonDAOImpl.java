package com.gss.egp.cptu.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gss.egp.cptu.dao.PersonDAO;
import com.gss.egp.cptu.model.Person;
 

 
public class PersonDAOImpl implements PersonDAO {
 
    private SessionFactory sessionFactory;
 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
     
    @Override
    public void save(Person p) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(p);
        tx.commit();
        session.close();
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public List<Person> list() {
        Session session = this.sessionFactory.openSession();
        List<Person> personList = session.createQuery("from Person").list();
        session.close();
        return personList;
    }

	@Override
	public void saveMore(List<Person> list) {
		Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        	for(Person p:list)
        		session.persist(p);
        tx.commit();
        session.close();
		
	}
 
}
