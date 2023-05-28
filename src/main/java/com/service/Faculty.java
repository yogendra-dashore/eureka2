package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.facultyvo.UserVo;


@Service
public class Faculty {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public List<UserVo> getAllUsers(){
		
		//RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<List<UserVo>> response = restTemplate.exchange("http://ADMIN-SERVICE/admin/allGet",HttpMethod.GET,
				null,new ParameterizedTypeReference<List<UserVo>>() {
					
				});
		
		List<UserVo> list = response.getBody();
		
		return list;
		
	}
public UserVo addUsers(UserVo userVo){
		
		//RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<UserVo> response = restTemplate.exchange("http://ADMIN-SERVICE/admin/Adduser",HttpMethod.POST,
				null,new ParameterizedTypeReference<UserVo>() {
					
				});
		
		UserVo list = response.getBody();
		
		return list;
		
	}
}
