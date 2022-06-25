package com.js.beans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("comp")
@Setter
@ToString
@ConfigurationProperties(prefix="org.js")
public class Company {
	
	private String name;
	private String address;
	private String company;
	private Long contact;

}
