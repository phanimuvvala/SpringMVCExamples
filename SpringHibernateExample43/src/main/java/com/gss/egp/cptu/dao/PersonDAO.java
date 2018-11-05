package com.gss.egp.cptu.dao;

import java.util.List;

import com.gss.egp.cptu.model.Person;

public interface PersonDAO {

	 public void save(Person p);
     
	    public List<Person> list();
	    
	    public void saveMore(List<Person> list);
}
