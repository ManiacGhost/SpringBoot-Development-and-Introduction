package com.harshSpringProject.demoPracticeOne;


public class Books {
	private long id;
	private String title;
	private String author;
	
	
	public Books(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	public long getId(){
		return id;
	}

	public String getTitle(){
		return title;
	}

	public String getAuthor(){
		return author;
	}



	@Override
	public String toString() {
		return "Books[id="+ id+", title =" + title +", author="+author+"]";
	}
	
	
}
