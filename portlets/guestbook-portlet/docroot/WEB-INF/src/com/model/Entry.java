package com.model;

public class Entry {
	private String name;
    private String message;
	public Entry(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}
	 public Entry() {

	        this.name = null;
	        this.message = null;

	    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
    

}
