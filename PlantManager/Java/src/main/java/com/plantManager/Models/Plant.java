package com.plantManager.Models;

import java.util.Date;

public class Plant {

	private long id; 
	private String name;
	private int userId;
	private int gardenId;
	private int waterRate;
	private String sunligthPref;
	private Date datePlanted;
	private Date dateFlowered;
	private Date dateProduced;
	private int plot;
	private int harvest; //needs entry in DB and units?
	
	public int getHarvest() {
		return harvest;
	}
	public void setHarvest(int harvest) {
		this.harvest = harvest;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getGardenId() {
		return gardenId;
	}
	public void setGardenId(int gardenId) {
		this.gardenId = gardenId;
	}
	public int getWaterRate() {
		return waterRate;
	}
	public void setWaterRate(int waterRate) {
		this.waterRate = waterRate;
	}
	public String getSunligthPref() {
		return sunligthPref;
	}
	public void setSunligthPref(String sunligthPref) {
		this.sunligthPref = sunligthPref;
	}
	public Date getDatePlanted() {
		return datePlanted;
	}
	public void setDatePlanted(Date datePlanted) {
		this.datePlanted = datePlanted;
	}
	public Date getDateFlowered() {
		return dateFlowered;
	}
	public void setDateFlowered(Date dateFlowered) {
		this.dateFlowered = dateFlowered;
	}
	public Date getDateProduced() {
		return dateProduced;
	}
	public void setDateProduced(Date dateProduced) {
		this.dateProduced = dateProduced;
	}
	public int getPlot() {
		return plot;
	}
	public void setPlot(int plot) {
		this.plot = plot;
	}
	
}
