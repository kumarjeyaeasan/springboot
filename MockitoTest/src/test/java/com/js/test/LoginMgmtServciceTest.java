package com.js.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;

import com.js.dao.ILoginDAO;
import com.js.service.ILogingMgmtService;
import com.js.service.LoginMgmtService;

public class LoginMgmtServciceTest {

	private static ILogingMgmtService loginService;
	private static ILoginDAO loginDAOMock;
	
	@BeforeAll
	public static void init() {
		/*
		 * Create Mock/Dummy Object
		 * 
		 * mock() method generates In Memory class implementing 
		 * ILoginDAO(I) having null method definitions for authenticate()
		 * method
		 * 
		 */
		loginDAOMock=Mockito.mock(ILoginDAO.class);
		
		// Create Service Class
		loginService = new LoginMgmtService(loginDAOMock);
	}
	
	@AfterAll
	public static void cleanUp() {
		loginDAOMock=null;
		loginDAOMock=null;
	}
	
	public void testLoginWithValidCred() {
		// Provide Stub for DAO's authenticate method
		Mockito.when(loginDAOMock.authenticate("senthil", "111")).thenReturn(1);
		
		assertTrue(loginService.login("senthil", "111"));
	}
	
	public void testLoginWithInValidCred() {
		// Provide Stub for DAO's authenticate method
		Mockito.when(loginDAOMock.authenticate("senthil", "123")).thenReturn(0);
		
		assertFalse(loginService.login("senthil", "123"));
	}
	
	public void testLoginWithNoCred() {
		// Provide Stub for DAO's authenticate method
		Mockito.when(loginDAOMock.authenticate("", "")).thenReturn(0);
		
		assertFalse(loginService.login("", ""));
	}
}
