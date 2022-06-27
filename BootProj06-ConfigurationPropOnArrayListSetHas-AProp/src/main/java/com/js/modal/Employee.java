package com.js.modal;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("emp")
@Data
@ConfigurationProperties(prefix="org.js")
public class Employee {
	// Simple Type
	private Integer eno;
	private String ename;
	
	// Array Type
	private String[] favColors;
	
	// Collection Type
	private List<String> nickNames;
	private Set<Long> phoneNumbers;
	private Map<String,Object> idDetails;
	
	// Has - A type
	private Company company;
	

}
