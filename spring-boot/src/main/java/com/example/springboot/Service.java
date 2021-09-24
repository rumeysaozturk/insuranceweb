package com.example.springboot;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CarService {

	@Autowired
	private UserRepository userRepo;
	@Autowired
	private CarRepository carRepo;
	@Autowired
	private HouseRepository houseRepo;
	@Autowired
	private ArabaSigortaRepository arabaSigortaRepo;

	public boolean carInsurance(@ModelAttribute("ArabaSigorta") ArabaSigorta arabaSigorta, @RequestParam String tc,
			@RequestParam String plaque) throws SQLException {
		int a = userRepo.findByTc(tc);
		int b = carRepo.findByPlaque(plaque);
		String brand = carRepo.findByBrand(plaque);

		if (!(a == 0) && !(b == 0)) {
			switchBrand(arabaSigorta,plaque);
			return true;
		} else {
		}

		return false;
	}

	public void switchBrand(ArabaSigorta arabaSigorta, String plaque) {
		double base = 2500;
		String brand = carRepo.findByBrand(plaque);
		base=switchColor(plaque);
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
		case "Ford":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Honda":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Hyundai":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Audi":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Volvo":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Citroen":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Opel":
			arabaSigorta.setOffer(base + (base / 5));
			break;
		case "Nissan":
			arabaSigorta.setOffer(base + (base / 5));
			break;

		}
	}
	public double switchColor( String plaque) {
		double base = switchModel(plaque);
		String color = carRepo.findByColor(plaque);
		switch (color) {

		case "Siyah":
			base=(base + (base / 5));
			break;
		case "Beyaz":
			base=(base + (base / 5));
			break;
		case "Kırmızı":
			base=(base + (base / 5));
			break;
		case "Gri":
			base=(base + (base / 5));
			break;
		case "Mavi":
			base=(base + (base / 5));
			break;
		case "Bej":
			base=(base + (base / 5));
			break;
		

		}
		return base;
	}
	
	public double switchModel( String plaque) {
		double base = accident(plaque);
		String model = carRepo.findByModel(plaque);
		switch (model) {

		case "Talisman":
			base=(base + (base / 5));
			break;
		case "Megane":
			base=(base + (base / 5));
			break;
		case "Clio":
			base=(base + (base / 5));
			break;
		case "520i":
			base=(base + (base / 5));
			break;
		case "118i":
			base=(base + (base / 5));
			break;
		case "320i":
			base=(base + (base / 5));
			break;
		case "A180":
			base=(base + (base / 5));
			break;
		case "C200d":
			base=(base + (base / 5));
			break;
		case "Vito":
			base=(base + (base / 5));
			break;
		case "Passat":
			base=(base + (base / 5));
			break;
		case "Polo":
			base=(base + (base / 5));
			break;
		case "Golf":
			base=(base + (base / 5));
			break;
		case "Egea":
			base=(base + (base / 5));
			break;
		case "Fiorino":
			base=(base + (base / 5));
			break;
		case "Doblo":
			base=(base + (base / 5));
			break;
		case "Focus":
			base=(base + (base / 5));
			break;
		case "Fiesta":
			base=(base + (base / 5));
			break;
		case "Galaxy":
			base=(base + (base / 5));
			break;
		case "Civic":
			base=(base + (base / 5));
			break;
		case "City":
			base=(base + (base / 5));
			break;
		case "Jazz":
			base=(base + (base / 5));
			break;
		case "Accent":
			base=(base + (base / 5));
			break;
		case "i10":
			base=(base + (base / 5));
			break;
		case "i20":
			base=(base + (base / 5));
			break;
		case "A3":
			base=(base + (base / 5));
			break;
		case "A4":
			base=(base + (base / 5));
			break;
		case "Q7":
			base=(base + (base / 5));
			break;
		case "S90":
			base=(base + (base / 5));
			break;
		case "S60":
			base=(base + (base / 5));
			break;
		case "S80":
			base=(base + (base / 5));
			break;
		case "Berlingo":
			base=(base + (base / 5));
			break;
		case "Aircross":
			base=(base + (base / 5));
			break;
		case "C5":
			base=(base + (base / 5));
			break;
		case "Corsa":
			base=(base + (base / 5));
			break;
		case "Astra":
			base=(base + (base / 5));
			break;
		case "Insignia":
			base=(base + (base / 5));
			break;
		case "Qashqai":
			base=(base + (base / 5));
			break;
		case "Micra":
			base=(base + (base / 5));
			break;
		case "Juke":
			base=(base + (base / 5));
			break;
		}
		
		return base;
	}
	public double accident( String plaque) {
		double base=2500;
		char acc=carRepo.findByAccident(plaque);
		if(acc=='V')
		{
			return base=(base+(base/4));
			
		}
		else {
			return base=(base-(base/10));
			
		}
	}
}
