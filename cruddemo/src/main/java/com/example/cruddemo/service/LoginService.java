package com.example.cruddemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cruddemo.model.Login;
import com.example.cruddemo.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	LoginRepository lr;
public String validateUser(String email,String password)
{
	String result="";
	Login u=lr.findByUsername(email);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
public Login saveUser(Login u) {
	// TODO Auto-generated method stub
	return lr.save(u);
}
}
