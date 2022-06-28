package com.js.modal;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("customer")
@ConfigurationProperties(prefix="cust.info")
@Data
public class Customer {
	private Integer custNo;
	private String custName;
	private String address;
	

}