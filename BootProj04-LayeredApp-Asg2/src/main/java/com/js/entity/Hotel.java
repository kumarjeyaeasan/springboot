package com.js.entity;

import lombok.Data;

@Data
public class Hotel {

	private Integer hno;
	private String hname;
	private Integer roomstot;
	private Integer roomsavl;
	private String address;
	private String city;
	private String state;
	private String country;
}
