package com.ty.trainapp.dto;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_table")
public class TrainDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="train_number")
	private int trainNumber;
	
	@Column(name = "train_name")
	private String name;
	
	@Column(name="type")
	private String type;
	
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="arrival_time")
	private LocalTime arrivalTime;
	
	@Column(name="departure_time")
	private LocalTime departureTime;
	
	@Column(name="destination_station")
	private String destinationStation;

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

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

	public LocalTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public LocalTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalTime departureTime) {
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
		return "Train [trainNumber=" + trainNumber + ", name=" + name + ", type=" + type + ", sourceStation="
				+ sourceStation + ", arrivalTime=" + arrivalTime + ", departureTime=" + departureTime
				+ ", destinationStation=" + destinationStation + "]";
	}

}