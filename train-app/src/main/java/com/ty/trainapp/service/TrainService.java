package com.ty.trainapp.service;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.trainapp.beans.Train;
import com.ty.trainapp.dao.TrainDao;
import com.ty.trainapp.dto.TrainDto;

@Service
public class TrainService {

	@Autowired
	private TrainDao trainDao;

	public TrainDto saveTrain(Train train) {

		TrainDto dto = new TrainDto();
		dto.setName(train.getName());
		dto.setType(train.getType());
		dto.setSourceStation(train.getSourceStation());
		dto.setDestinationStation(train.getDestinationStation());
		LocalTime arrivalTime = LocalTime.parse(train.getArrivalTime());
		dto.setArrivalTime(arrivalTime);
		LocalTime departureTime = LocalTime.parse(train.getDepartureTime());
		dto.setDepartureTime(departureTime);

		return trainDao.insertTrain(dto);
	}

	public TrainDto searchTrain(int trainNumber) {
		return trainDao.searchTrain(trainNumber);
	}

	public List<TrainDto> getAllTrains() {
		return trainDao.getAllTrains();
	}

	public TrainDto updateTrain(int trainNumber, Train train) {

		TrainDto trainDto = new TrainDto();

		trainDto.setTrainNumber(trainNumber);
		trainDto.setName(train.getName());
		trainDto.setType(train.getType());
		trainDto.setSourceStation(train.getSourceStation());
		trainDto.setDestinationStation(train.getDestinationStation());
		LocalTime arrivalTime = LocalTime.parse(train.getArrivalTime());
		trainDto.setArrivalTime(arrivalTime);
		LocalTime departureTime = LocalTime.parse(train.getDepartureTime());
		trainDto.setDepartureTime(departureTime);

		return trainDao.updateTrain(trainDto);
	}

}
