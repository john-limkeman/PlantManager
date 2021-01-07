package com.plantManager.Models;

public class Garden {
	private long id;
	private long userId;
	private Boolean[] plots;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUser_id() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public Boolean[] getPlots() {
		return plots;
	}
	public void setPlots(Boolean[] plots2) {
		this.plots = plots2;
	}
	
	
}
