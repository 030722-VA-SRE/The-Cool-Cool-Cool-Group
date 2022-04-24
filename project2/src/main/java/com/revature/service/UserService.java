package com.revature.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.exceptions.UserAlreadyExistsException;
import com.revature.exceptions.UserNotFoundException;
import com.revature.modals.Users;
import com.revature.repositories.NinjaRepository;
import com.revature.repositories.UserRepository;

@Service
public class UserService {
	
	private UserRepository userRepo;

	
	private static Logger log = LoggerFactory.getLogger(UserService.class);	//@Enumerated()
	
	@Autowired
	public UserService(UserRepository userRepo,NinjaRepository ninjaRepo,
			AuthService authService){
		super();
		this.userRepo = userRepo;
	}
	@Transactional
	public Users addUser(Users customer) throws UserAlreadyExistsException, NoSuchAlgorithmException {		
		if(customer == null) {
			//log.warn("Customer was not provided");
			throw new NullPointerException();
		}
		if (userRepo.existsUsersByuserName(customer.getUserName())==true) {
			throw new UserAlreadyExistsException();
		}

		return userRepo.save(customer);
	}
	//Get all users in User table
	public List<Users> getUsers(){
		
		return userRepo.findAll();	
	}
	
	
	

	
}
