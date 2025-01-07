package com.ourmarket.ReactAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ourmarket.ReactAPI.dto.BoardDto;
@Mapper
public interface BoardMapper {
	
     int boardCount();
     BoardDto getData(String boardId);
     int  insertBoard(BoardDto boardDto);
     int  deleteBoard(BoardDto boardDto);
     List<BoardDto> boardList(BoardDto boardDto);    

}
