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
	
	public List<BoardDto>  BoardList(BoardDto boardDto) {
		return boardMapper.boardList(boardDto);
	}

	public List<BoardDto>  BoardListForGet(BoardDto boardDto) {
		return boardMapper.boardList(boardDto);
	}	
	
	public BoardDto getBoardFindById(BoardDto boardDto) {
		return boardMapper.findById(boardDto);
	}	
	
	public int insertBoard(BoardDto boardDto) {		
		return boardMapper.insertBoard(boardDto);
	}

	public int updateBoard(BoardDto boardDto) {		
		return boardMapper.updateBoard(boardDto);
	}	
	
	public int deleteBoard(BoardDto boardDto) {		
		return boardMapper.deleteBoard(boardDto);
	}		
	
}
