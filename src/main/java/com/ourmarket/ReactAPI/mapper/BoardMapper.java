package com.ourmarket.ReactAPI.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ourmarket.ReactAPI.dto.BoardDto;
@Mapper
public interface BoardMapper {

     BoardDto findById(BoardDto boardDto);
     int  insertBoard(BoardDto boardDto);
     int  deleteBoard(BoardDto boardDto);
     int  updateBoard(BoardDto boardDto);     
     
     List<BoardDto> boardList(BoardDto boardDto);    
     List<BoardDto> boardListForGet(BoardDto boardDto);   
}
