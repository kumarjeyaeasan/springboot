package com.js.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.js.entity.Hotel;

@Repository("hotelDAO")
public class HotelDAOImpl implements IHotelDAO {
	
	public static final String GET_HOTEL_BY_CITY=
			"SELECT HNO,HNAME,ROOMSTOT,ROOMSAVL,ADDRESS,CITY,STATE,COUNTRY FROM HOTEL WHERE CITY IN(?,?,?)";
	
	@Autowired
	private DataSource ds;

	@Override
	public List<Hotel> getHotelByCity(String city1, String city2, String city3) throws Exception {
		
		List<Hotel> list=null;
		
		try (Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(GET_HOTEL_BY_CITY);
				) {
			ps.setString(1,city1); ps.setString(2, city2); ps.setString(3, city3);
			
			try(ResultSet rs = ps.executeQuery()){
				list = new ArrayList();
				while (rs.next()) {
					Hotel hotel = new Hotel();
					hotel.setHno(rs.getInt(1));
					hotel.setHname(rs.getString(2));
					hotel.setRoomstot(rs.getInt(3));
					hotel.setRoomsavl(rs.getInt(4));
					hotel.setAddress(rs.getString(5));
					hotel.setCity(rs.getString(6));
					hotel.setState(rs.getString(7));
					hotel.setCountry(rs.getString(8));
					list.add(hotel);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		return list;
	}

}
