package com.ty.trainapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.trainapp.dto.TrainDto;

@Repository
public class TrainDao {
	
	@Autowired
	private EntityManagerFactory factory;
	
	public TrainDto insertTrain(TrainDto newTrainDto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(newTrainDto);
			transaction.commit();
			return newTrainDto;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
	}

	public TrainDto searchTrain(int trainNumber) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(TrainDto.class, trainNumber);
	}

	public List<TrainDto> getAllTrains() {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("FROM TrainDto");
		return query.getResultList();
	}

	public TrainDto updateTrain(TrainDto trainDto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.merge(trainDto);
			transaction.commit();
			return trainDto;
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			return null;
		}
	}

}
