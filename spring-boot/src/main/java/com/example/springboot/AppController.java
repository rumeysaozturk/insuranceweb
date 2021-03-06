package com.example.springboot;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@Autowired
	private CarService carService;
	@Autowired
	private CarBrandsRepository carBrandRepo;
	@Autowired
	private CarModelRepository modelRepo;
	@Autowired
	private ColorRepository colorRepo;
	@Autowired
	private ArabaKayıtFormRepository akfRepo;

	
	
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

		model.addAttribute("arabaKayitForm", new ArabaKayıtForm());
		List<CarBrands> listCarBrands = carBrandRepo.findAll();
		model.addAttribute("carBrands", listCarBrands);
		List<CarModel> listModels = modelRepo.findAll();
		model.addAttribute("carModels", listModels);
		List<CarColors> listColors = colorRepo.findAll();
		model.addAttribute("carColors", listColors);
		model.addAttribute("car", new Car());

		return "araba";
	}

	@GetMapping("/house")
	public String house(Model model) {
		model.addAttribute("house", new House());
		return "konut";
	}

	@GetMapping("/kullaniciliste")
	public String kullanıcıliste(Model model) {
		List<User> listUser = userRepo.findAll();
		model.addAttribute("listUser", listUser);
		return "kullaniciliste";
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

	@GetMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable(name = "id") int id) {
		userRepo.deleteById(id);
		return "redirect:/kullaniciliste";
	}

	@GetMapping("/deleteCar/{id}")
	public String deleteCar(@PathVariable(name = "id") int id) {
		carRepo.deleteById(id);
		return "redirect:/arabaliste";
	}

	@GetMapping("/deleteHouse/{id}")
	public String deleteHouse(@PathVariable(name = "id") int id) {
		houseRepo.deleteById(id);
		return "redirect:/konutliste";
	}
	
	@GetMapping("/updateUserPage/{id}")
	public String updateUserPage(@PathVariable(name = "id") int id,Model model) {
		
		User user = userRepo.getById(id);
		model.addAttribute("user",user);
		
		
		return "updateUserPage";
	}
	
	@GetMapping("/UpdateCarPage/{id}")
	public String updateCarPage(@PathVariable(name = "id") int id,Model model) {
		model.addAttribute("arabaKayitForm", new ArabaKayıtForm());
		List<CarBrands> listCarBrands = carBrandRepo.findAll();
		model.addAttribute("carBrands", listCarBrands);
		List<CarModel> listModels = modelRepo.findAll();
		model.addAttribute("carModels", listModels);
		List<CarColors> listColors = colorRepo.findAll();
		model.addAttribute("carColors", listColors);
		Car car = carRepo.getById(id);
		model.addAttribute("car",car);
		
		
		return "UpdateCarPage";
	}
	@PostMapping("/updateCar")
	public String updateCar(@RequestParam(name = "plaque", required = false) String plaque, @RequestParam(name = "brand", required = false) String brand,
			@RequestParam(name = "model", required = false) String model, @RequestParam(name = "color", required = false) String color,@RequestParam(name = "year", required = false) Long year, @RequestParam(name = "accident", required = false) char accident) {
		Car car = carRepo.findByPlaqueCar(plaque);
		
		int brandId = Integer.parseInt(brand);
		String brandName = carBrandRepo.findByBrandId(brandId);
		int modelId = Integer.parseInt(model);
		String modelName = modelRepo.findByModelId(modelId);
		int colorId = Integer.parseInt(color);
		String colorName = colorRepo.findByColorId(colorId);
		
		car.setPlaque(plaque);
		car.setBrand(brandName);
		car.setModel(modelName);
		car.setColor(colorName);
		car.setYear(year);
		car.setAccident(accident);
		carRepo.save(car);
		
		
		return "redirect:/arabaliste";
	}
	@PostMapping("/updateUser")
	public String updateUser(@RequestParam(name = "tc", required = false) String tc, @RequestParam(name = "name", required = false) String name,
			@RequestParam(name = "surname", required = false) String surname, @RequestParam(name = "phoneNumber", required = false) String phone,@RequestParam(name = "gender", required = false) char gender, @RequestParam(name = "date", required = false) java.sql.Date date) {
		User user = userRepo.findByTcUser(tc);
		user.setName(name);
		user.setSurname(surname);
		user.setTc(tc);
		user.setPhoneNumber(phone);
		user.setGender(gender);
		user.setDate(date);
		userRepo.save(user);
		
		
		return "redirect:/kullaniciliste";
	}

	@RequestMapping(value = "/process_register", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("User") User user, Model model,BindingResult bindingResult) {
	//	String tc= userRepo.findByIdTc(id);
	//	String phone =userRepo.findByIdPhone(id);
		if (userRepo.findTc().contains(user.getTc())||userRepo.findPhone().contains(user.getPhoneNumber())||bindingResult.hasErrors()) {
			model.addAttribute("message", "Kullanıcı mevcut!");
			
			return "redirect:/";
			
		} else {
			userRepo.save(user);

			return "redirect:/kullaniciliste";
		}

		
	}

	@RequestMapping(value = "/addCarInsurance", method = RequestMethod.POST)
	public String addCarInsurance(@ModelAttribute("ArabaSigorta") ArabaSigorta arabaSigorta, Model model,
			@RequestParam String tc, @RequestParam String plaque) throws SQLException {

		User userR = userRepo.findByTcUser(tc);
		Car carR = carRepo.findByPlaqueCar(plaque);
		if (carService.carInsurance(arabaSigorta, tc, plaque,model)) {
			model.addAttribute("car", carR);
			model.addAttribute("user", userR);
			arabaSigortaRepo.save(arabaSigorta);
			// ArabaSigorta aSR=arabaSigortaRepo.findByTcPlaque(tc, plaque);
			model.addAttribute("as", arabaSigorta.getOffer());
		} else {
			return "arabasigorta";
		}

		return "teklif";
	}

	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute("ArabaKayitForm") ArabaKayıtForm akf, @RequestParam String brand,
			@RequestParam String model, @RequestParam String color) {
		int brandId = Integer.parseInt(brand);
		String brandName = carBrandRepo.findByBrandId(brandId);
		int modelId = Integer.parseInt(model);
		String modelName = modelRepo.findByModelId(modelId);
		int colorId = Integer.parseInt(color);
		String colorName = colorRepo.findByColorId(colorId);
		Car car = new Car();
		car.setPlaque(akf.getPlaque());
		car.setBrand(brandName);
		car.setModel(modelName);
		car.setColor(colorName);
		car.setYear(akf.getYear());
		car.setAccident(akf.getAccident());

		if (!(carRepo.findPlaque().contains(akf.getPlaque()))) {

			carRepo.save(car);
			return "redirect:/arabaliste";
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
