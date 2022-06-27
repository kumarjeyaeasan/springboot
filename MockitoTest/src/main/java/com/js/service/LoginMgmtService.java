package com.js.service;

import com.js.dao.ILoginDAO;

public class LoginMgmtService implements ILogingMgmtService {
	
	private ILoginDAO loginDAO;

	public LoginMgmtService(ILoginDAO dao) {
		this.loginDAO = dao;
	}
	
	@Override
	public boolean login(String userName, String pwd) {
		
		if(userName.equals("")||(pwd.equals("")))
			throw new IllegalArgumentException("Empty Credentials");
		
		int count = loginDAO.authenticate(userName, pwd);
		if(count==0) 
			return false;
		else
			return true;
	}

}
