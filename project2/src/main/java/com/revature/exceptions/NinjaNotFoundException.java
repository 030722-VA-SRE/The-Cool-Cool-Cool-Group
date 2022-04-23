package com.revature.exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.service.NinjaService;

public class NinjaNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger log = LoggerFactory.getLogger(NinjaService.class);
	
	public NinjaNotFoundException(){
		
	}
	public NinjaNotFoundException(String message){
		log.error(message);
	}

}
