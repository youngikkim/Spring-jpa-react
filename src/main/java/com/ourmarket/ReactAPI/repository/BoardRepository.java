package com.ourmarket.ReactAPI.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ourmarket.ReactAPI.dto.BoardDto;
import com.ourmarket.ReactAPI.mapper.BoardMapper;

@Repository
public interface BoardRepository {

	@Autowired BoardMapper boardMapper;
	
	public BoardDto getBoardById(int id) {
		return boardMapper.selectBoard(int id);
	}
}
