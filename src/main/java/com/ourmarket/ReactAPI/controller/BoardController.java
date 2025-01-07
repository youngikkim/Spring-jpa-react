package com.ourmarket.ReactAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ourmarket.ReactAPI.manager.BoardManager;

import com.ourmarket.ReactAPI.dto.BoardDto;
@RestController
@RequestMapping("/API/Board")
public class BoardController {
	@Autowired
	private BoardManager boardManager;
    
	public BoardController(BoardManager boardManager) {
        this.boardManager = boardManager;
    }	

	@PostMapping
    public ResponseEntity<List<BoardDto>> getBoardList(@RequestBody BoardDto boardDto) {

		List<BoardDto> board = boardManager.getBoardList(boardDto);
        return ResponseEntity.ok(board);
    }

    
}
