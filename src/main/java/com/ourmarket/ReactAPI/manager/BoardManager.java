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
	
	 public List<BoardDto> BoardList(BoardDto boardDto) {
		return boardRepository.BoardListForGet(boardDto);		 
	 }

	 public List<BoardDto> BoardListForGet(BoardDto boardDto) {
		return boardRepository.BoardList(boardDto);		 
	 }	 
	 
	 public BoardDto BoardFindById(BoardDto boardDto) {
		return boardRepository.getBoardFindById(boardDto);		 
	 }	 	 

	 public int BoardInsert(BoardDto boardDto) {
		return boardRepository.insertBoard(boardDto);		 
	 }	 	 
	 public int BoardUpdate(BoardDto boardDto) {
		return boardRepository.updateBoard(boardDto);		 
	 }	 	 
	 
	 public int BoardDelete(BoardDto boardDto) {
		return boardRepository.deleteBoard(boardDto);		 
	 }		 
	 
}
