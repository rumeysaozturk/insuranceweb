package com.example.springboot;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.springboot.*;
import java.util.Calendar;

@Controller
public class AppController {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CarRepository carRepo;
	@Autowired
	private HouseRepository houseRepo;
	@Autowired
	private ArabaSigortaRepository arabaSigortaRepo;

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

	@GetMapping("/kullanıcı")
	public String user(Model model) {
		model.addAttribute("user", new User());
		return "kullanıcı";
	}

	@GetMapping("/araba")
	public String car(Model model) {
		model.addAttribute("car", new Car());
		return "araba";
	}

	@GetMapping("/house")
	public String house(Model model) {
		model.addAttribute("house", new House());
		return "konut";
	}

	@GetMapping("/kullanıcıliste")
	public String kullanıcıliste(Model model) {
		List<User> listUser = userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "kullanıcıliste";
	}
	@GetMapping("/arabaliste")
	public String arabaliste(Model model) {
		List<Car> listCar = carRepo.findAll();
		model.addAttribute("listCar", listCar);
		return "arabaliste";
	}	
	@GetMapping("/konutliste")
	public String konutliste(Model model) {
		List<House> listHouse = houseRepo.findAll();
		model.addAttribute("listHouse", listHouse);
		return "konutliste";
	}

	@GetMapping("/arabasigorta")
	public String arabaSigorta(Model model) {
		model.addAttribute("arabaSigorta", new ArabaSigorta());
		return "arabasigorta";
	}

	@RequestMapping(value = "/process_register", method = RequestMethod.POST)
	public String addUser(@ModelAttribute("User") User user) {

		if (!(userRepo.findAll().contains(user))) {

			userRepo.save(user);

			return "redirect:/";
		} else {

		}

		return "redirect:/";
	}

	@RequestMapping(value = "/addCarInsurance", method = RequestMethod.POST)
	public String addCarInsurance(@ModelAttribute("ArabaSigorta") ArabaSigorta arabaSigorta,Model model, @RequestParam String tc,
			@RequestParam String plaque) throws SQLException {
		int a = userRepo.findByTc(tc);
		int b = carRepo.findByPlaque(plaque);
		String brand = carRepo.findByBrand(plaque);
		double base = 2500;
		
		User userR= userRepo.findByTcUser(tc);
		Car carR =carRepo.findByPlaqueCar(plaque);
		
		
		if (!(a == 0) && !(b == 0)) {
			model.addAttribute("car",carR);
			model.addAttribute("user",userR);

			switch (brand) {

			case "Mercedes":
				arabaSigorta.setOffer(base + (base / 5));
				break;
			case "BMW":
				arabaSigorta.setOffer(base + (base / 5));
				break;
			case "Volkswagen":
				arabaSigorta.setOffer(base + (base / 6));
				break;
			case "Fiat":
				arabaSigorta.setOffer(base + (base / 8));
				break;
			case "Renault":
				arabaSigorta.setOffer(base + (base / 8));
				break;
			}

			arabaSigortaRepo.save(arabaSigorta);
			//ArabaSigorta aSR=arabaSigortaRepo.findByTcPlaque(tc, plaque);
			model.addAttribute("as",arabaSigorta.getOffer());

		} else {

		}

		return "teklif";
	}



	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute("car") Car car) {
		if (!(carRepo.findAll().contains(car))) {

			carRepo.save(car);

			return "redirect:/";
		} else {

		}
		return "redirect:/";

	}

	@RequestMapping(value = "/addHouse", method = RequestMethod.POST)
	public String addHouse(@ModelAttribute("house") House house) {
		if (!(houseRepo.findAll().contains(house))) {

			houseRepo.save(house);

			return "redirect:/";
		} else {

		}
		return "redirect:/";
	}

}
