package com.js.service;

import java.util.List;

import com.js.entity.Hotel;

public interface IHotelService {
	
	public List<Hotel> getAllHotelsByCity(String city1, String city2, String city3) throws Exception;

}
