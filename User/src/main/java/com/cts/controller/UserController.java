package com.cts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cts.dao.UserDao;
import com.cts.entity.Users;

@Controller
public class UserController {
	
	@Autowired
	private UserDao dao;
	
	@ResponseBody
	@RequestMapping("/save")
	public String save(@ModelAttribute("user") Users user){
		System.out.println("IN CONTROLLER");
		
		boolean check = dao.save(user);
		return "Saved";
	}
	
	@ResponseBody
	@RequestMapping("/fetch")
	public List<Users> getDetails(@ModelAttribute("user") Users user) {
		//List<Users> listDetails = dao.getById(user);
		return null;
	}
	
	@ResponseBody
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("user") Users user) {
		System.out.println(user +"    Deleted");
		return "Deleted";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@ModelAttribute("user") Users user) {
		System.out.println(user +"    Updated");
		return "Updated";
	}
	
	@ModelAttribute("user")
	public Users userObject() {
		Users user = new Users();
		return user;
	}
	
}
