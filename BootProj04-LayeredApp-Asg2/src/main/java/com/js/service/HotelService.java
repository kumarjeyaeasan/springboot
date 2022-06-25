package com.js.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.dao.IHotelDAO;
import com.js.entity.Hotel;

@Service("hotelService")
public class HotelService implements IHotelService {
	
	@Autowired
	private IHotelDAO dao;

	@Override
	public List<Hotel> getAllHotelsByCity(String city1, String city2, String city3) throws Exception {
		
		List<Hotel> list = dao.getHotelByCity(city1, city2, city3);

		return list;
	}

}
