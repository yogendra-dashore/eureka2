package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facultyvo.UserVo;
import com.service.Faculty;


@RequestMapping("/faculty")
@RestController
public class FacultyController {
	
	@Autowired
	Faculty faculty;
	
	
	@GetMapping("/allGet")
	public List<UserVo> getAllUser(){
		List<UserVo> user = faculty.getAllUsers();
		return user;
		
	}
	
	


	@PostMapping("/UserAdded")
	public UserVo addUser(@RequestBody UserVo userVo) {
		 UserVo user =  faculty.addUsers(userVo);
		 return user;
		
	}
	
	
//	public ResponseEntity<?> gellAllUser(){
//		return null;
		
	}


