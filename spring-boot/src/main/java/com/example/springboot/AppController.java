package com.example.springboot;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Calendar;
@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	private CarRepository carRepo;
	private HouseRepository houseRepo;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user", new User());
		return "index";
	}
	@GetMapping("/araba")
	public String car(Model model) {
		return "araba";
	}
	@GetMapping("/house")
	public String house(Model model) {
		return "konut";
	}

	@GetMapping("/liste")
	public String liste(Model model) {
		List<User> listUser = userRepo.findAll();
	    model.addAttribute("listUser", listUser);
		return "liste";
	}
	@RequestMapping(value = "/process_register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("User") User user) {

		userRepo.save(user);
	if(user.getInsuranceType().equals("Trafik")) {
		return "araba";
	}
	else if(user.getInsuranceType().equals("Konut")) {
		return "konut";
	}
	else {
		
		return "redirect:/";
	}
	
	
	}
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute("Car") Car car) {
		//carRepo.save(car);
		return "redirect:/";
		
	}
	@RequestMapping(value = "/addHouse", method = RequestMethod.POST)
	public String addHouse(@ModelAttribute("House") House house) {
		houseRepo.save(house);
		return "redirect:/";
	}
	
}


