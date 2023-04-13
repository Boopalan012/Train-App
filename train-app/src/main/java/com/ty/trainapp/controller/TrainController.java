package com.ty.trainapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.trainapp.beans.Train;
import com.ty.trainapp.dto.TrainDto;
import com.ty.trainapp.service.TrainService;

@Controller
public class TrainController {

	@Autowired
	private TrainService trainService;

	@GetMapping("/index")
	public ModelAndView getHomePage(ModelAndView modelAndView) {
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@GetMapping("/add-train")
	public ModelAndView getAddTrainFormPage(ModelAndView modelAndView) {
		modelAndView.setViewName("add-train-form");
		return modelAndView;
	}

	@PostMapping("/trains")
	public String saveTrain(Train train, Model myModel) {
		TrainDto savedTrain = trainService.saveTrain(train);
		if (savedTrain != null) {
			myModel.addAttribute("msg", "Train Added ");
			return "display-train";
		} else {
			return "redirect:/add-train";
		}
	}

	@GetMapping("/search-train-page")
	public ModelAndView getSearchPageForm(ModelAndView modelAndView) {
		modelAndView.setViewName("search-train-form");
		return modelAndView;
	}

	@GetMapping("/search-train")
	public ModelAndView searchTrain(@RequestParam("trainNumber") int trainNumber, Model model,
			ModelAndView modelAndView) {
		TrainDto trainDto = trainService.searchTrain(trainNumber);
		if (trainDto != null) {
			model.addAttribute("msg", trainDto);
		} else {
			model.addAttribute("msg", "Train Data not found for train number " + trainNumber);
		}
		modelAndView.setViewName("display-train");
		return modelAndView;
	}

	@GetMapping("/display-all")
	public ModelAndView viewAllTrains(ModelAndView modelAndView, Model model) {

		List<TrainDto> allTrains = trainService.getAllTrains();
		model.addAttribute("trains", allTrains);
		modelAndView.setViewName("display-all-trains");
		return modelAndView;
	}

	@GetMapping("/edit/{trainNum}")
	public ModelAndView getEditTrainPage(ModelAndView modelAndView,Model model, @PathVariable("trainNum") int trainNumber) {
		TrainDto searchedTrain = trainService.searchTrain(trainNumber);
		if(searchedTrain == null) {
			model.addAttribute("msg", "Update Cannot be done because Data not found for tarin number "+trainNumber);
			modelAndView.setViewName("display-train");
		} else {
			model.addAttribute("train", searchedTrain);
			modelAndView.setViewName("edit-train-page");
		}
		return modelAndView;
	}
	
	@PostMapping("/update-train")
	public String updateTrain(Train train,ModelAndView modelAndView,@RequestParam("trainNumber")int trainNumber) {
		TrainDto trainDto = trainService.updateTrain(trainNumber, train);
		return "redirect:/display-all";
		
	}

}
