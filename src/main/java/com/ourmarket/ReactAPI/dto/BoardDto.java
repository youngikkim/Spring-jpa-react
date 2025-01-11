package com.ourmarket.ReactAPI.dto;

public class BoardDto {

    private String BoardId;	
    private String Title;	
    private String Content;
    private String Name;	
    private String Read;

    private Integer ListSize; 
    private Integer PAGE_NO;
    private String SearchWord;
    
    
    

	public String getSearchWord() {
		return SearchWord;
	}

	public void setSearchWord(String searchWord) {
		SearchWord = searchWord;
	}

	public Integer getListSize() {
		return ListSize;
	}

	public void setListSize(Integer listSize) {
		ListSize = listSize;
	}

	public Integer getPAGE_NO() {
		return PAGE_NO;
	}

	public void setPAGE_NO(Integer pAGE_NO) {
		PAGE_NO = pAGE_NO;
	}


	public String getBoardId() {
		return BoardId;
	}

	public void setBoardId(String boardId) {
		BoardId = boardId;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getRead() {
		return Read;
	}

	public void setRead(String read) {
		Read = read;
	}   
    
    

  
	
}
