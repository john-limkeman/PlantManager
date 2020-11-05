package com.plantManager.Models;

public class Garden {
	private long id;
	private long user_id;
	private boolean[] plots;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public boolean[] getPlots() {
		return plots;
	}
	public void setPlots(boolean[] plots) {
		this.plots = plots;
	}
	
	
}
