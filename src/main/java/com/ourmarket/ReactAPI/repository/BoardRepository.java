package com.ourmarket.ReactAPI.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ourmarket.ReactAPI.dto.BoardDto;
import com.ourmarket.ReactAPI.mapper.BoardMapper;

@Repository
public class BoardRepository{

	@Autowired 
	private BoardMapper boardMapper;
	
	public List<BoardDto> getBoardList(BoardDto boardDto) {
		return boardMapper.boardList(boardDto);
	}

}
