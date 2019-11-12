package com.cts.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.entity.Users;

@Repository
public class UserDaoImpl implements UserDao {
	
//	@Autowired
//	private SessionFactory sessionFactory;

	@Override
	public boolean save(Users user) {
		// TODO Auto-generated method stub
		
		System.out.println("IN UserDaoImpl		" + user);
		
//		Session session = sessionFactory.openSession();
//		session.persist(user);
//		session.close();
		return false;
	}
	
	@Override
	public List<Users> getById(Users user) {
		System.out.println("IN UserDaoImpl		" + user);
//		Session session = sessionFactory.openSession();
//		Query query = session.createQuery("from Users U where U.userId = :userId");
//		List<Users> list = query.list();

		return null;
	}

	@Override
	public boolean updateUser(Users user) {
		
		System.out.println("IN UserDaoImpl		" + user);
		
//		Session session = sessionFactory.openSession();
//		session.merge(user);
		
		return false;
	}

	@Override
	public boolean deleteUser(Users user) {
		System.out.println("IN UserDaoImpl		" + user);
//		Session session = sessionFactory.openSession();
//		session.delete(user);
		return false;
	}

	@Override
	public List<Users> getAllUsers(Users user) {
		System.out.println("IN UserDaoImpl		" + user);
//		Session session = sessionFactory.openSession();
//		Query query = session.createQuery("from Users U where U.userId");
//		List<Users> list = query.list();
		
		return null;
	}
	
	
	

}
