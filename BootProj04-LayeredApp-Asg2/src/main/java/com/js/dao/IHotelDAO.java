package com.js.dao;

import java.util.List;

import com.js.entity.Hotel;

public interface IHotelDAO {
	
	public List<Hotel> getHotelByCity(String city1, String city2, String city3) throws Exception;

}
