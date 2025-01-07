package com.ourmarket.ReactAPI.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ourmarket.ReactAPI.dto.BoardDto;
import com.ourmarket.ReactAPI.repository.BoardRepository;

@Service
public class BoardManager {

	 @Autowired
	 private BoardRepository boardRepository;
	
	 public List<BoardDto> getBoardList(BoardDto boardDto) {
		return boardRepository.getBoardList(boardDto);
		 
	 }

/*	 
	 public int <BoardDto> boardCount() {
		
		 return boardRepository.
		 
	 }	
	 
	 
	 
     int boardCount();
     List<BoardDto>  boardList(); 
     BoardDto getData(String boardId);
     int  insertBoard(BoardDto boardDto);
     int  deleteBoard(BoardDto boardDto);
     List<BoardDto> boardListForPage(int ListSize, int PAGE_NO); 
  */   
}
