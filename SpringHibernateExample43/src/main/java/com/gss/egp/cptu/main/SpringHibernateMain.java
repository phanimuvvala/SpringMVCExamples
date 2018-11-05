package com.gss.egp.cptu.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gss.egp.cptu.dao.PersonDAO;
import com.gss.egp.cptu.model.Person;
 

 
public class SpringHibernateMain {
 
    public static void main(String[] args) {
 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        PersonDAO personDAO = context.getBean(PersonDAO.class);
         
        Person person = new Person();
        person.setName("11111"); 
        person.setCountry("India");
        
        Person person1 = new Person();
        person1.setName("2222"); 
        person1.setCountry("India");
        
        Person person2 = new Person();
        person2.setName("3333"); 
        person2.setCountry("India");
        
        Person person3 = new Person();
        person3.setName("4444"); 
        person3.setCountry("India");
         
        //personDAO.save(person);
        List<Person> list1=new ArrayList<Person>();
         list1.add(person1);
         list1.add(person2);
         list1.add(person3);
         personDAO.saveMore(list1);
        System.out.println("Person::"+person);
         
        List<Person> list = personDAO.list();
         
        for(Person p : list){
            System.out.println("Person List::"+p);
        }
        //close resources
        context.close();    
    }
}
