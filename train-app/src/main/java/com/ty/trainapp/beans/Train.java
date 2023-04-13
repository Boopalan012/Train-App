package com.ty.trainapp.beans;

public class Train {

	private String name;
	private String type;
	private String sourceStation;
	private String arrivalTime;
	private String departureTime;
	private String destinationStation;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", type=" + type + ", sourceStation="
				+ sourceStation + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", destinationStation=" + destinationStation + "]";
	}

}