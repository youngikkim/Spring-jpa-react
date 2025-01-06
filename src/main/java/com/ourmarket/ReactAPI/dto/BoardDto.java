package com.ourmarket.ReactAPI.dto;

public class BoardDto {

    private String BoardId;	
    private String Title;	
    private String Content;
    private String Name;	
    private String Read;

    // 기본 생성자
    public BoardDto(){}

    // 매개변수를 받는 생성자
    public BoardDto(String BoardId, String Title, String Content, String Name, String Read) {
        this.BoardId = BoardId;
        this.Title = Title;
        this.Content = Content;  // name 필드와 매개변수 연결
        this.Name = Name;
        this.Read = Read;
    }

    // toString 메서드
    @Override
    public String toString() {
        return "UserDto ["
                + "BoardId=" + BoardId + "/ "
                + "Title=" + Title + "/ "
                + "Content=" + Content + "/ "
                + "Name=" + Name + "/ "          
                + "Read=" + Read + "/ "        
                + "]";        
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
