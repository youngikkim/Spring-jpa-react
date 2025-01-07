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

		List<BoardDto> board = boardManager.BoardList(boardDto);
        return ResponseEntity.ok(board);
    }

	@GetMapping("/{listSize}/{PAGE_NO}/{SearchWord}")
	public ResponseEntity<List<BoardDto>> BoardListForGet(
	        @PathVariable("listSize") int listSize,
	        @PathVariable("PAGE_NO") int pageNo,
	        @PathVariable("SearchWord") String searchWord) {
	    
	    // BoardDto 객체 생성 및 파라미터 설정
	    BoardDto boardDto = new BoardDto();
	    boardDto.setListSize(listSize);
	    boardDto.setPAGE_NO(pageNo);
	    boardDto.setSearchWord(searchWord);
	    
	    // 서비스 호출하여 데이터 받아오기
	    List<BoardDto> board = boardManager.BoardList(boardDto);
	    
	    // ResponseEntity로 응답 반환
	    return ResponseEntity.ok(board);
	}
	@GetMapping("/{BoardId}")
	public ResponseEntity<BoardDto> BoardListForGet(
	        @PathVariable("BoardId") String BoardId) {
	    
	    // BoardDto 객체 생성 및 파라미터 설정
	    BoardDto boardDto = new BoardDto();
	    boardDto.setBoardId(BoardId);
	    boardDto.setListSize(0);
	    boardDto.setPAGE_NO(0);
	    boardDto.setSearchWord("");
	    
	    // 서비스 호출하여 데이터 받아오기
        boardDto = boardManager.BoardFindById(boardDto);
	    
	    // ResponseEntity로 응답 반환
	    return ResponseEntity.ok(boardDto);
	}   
}
