package com.js.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.js.entity.Hotel;
import com.js.service.IHotelService;

@Controller("hotelController")
public class HotelController {
	@Autowired
	private IHotelService service;
	
	public List<Hotel> getHotelsByCity(String city1, String city2, String city3) throws Exception {
		
		List<Hotel> list = service.getAllHotelsByCity(city1, city2, city3);
		
		return list;
	}

}
