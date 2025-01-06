package com.ourmarket.ReactAPI.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ourmarket.ReactAPI.repository.BoardRepository;

@Service
public class BoardManager {

	 @Autowired
	 private BoardRepository boardRepository;
	
	
}
