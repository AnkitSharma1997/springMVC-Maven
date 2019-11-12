package com.cts.dao;

import java.util.List;

import com.cts.entity.Users;

public interface UserDao {
	
	public boolean save(Users user);
	public List<Users> getAllUsers(Users usesr);
	public boolean updateUser(Users user);
	public List<Users> getById(Users usesr);
	public boolean deleteUser(Users user);
    
}
