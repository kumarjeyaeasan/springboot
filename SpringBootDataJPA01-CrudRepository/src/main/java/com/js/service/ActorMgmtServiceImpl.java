package com.js.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.entity.Actor;
import com.js.repository.IActorRepo;

@Service("ActorService")
public class ActorMgmtServiceImpl implements IActorMgmt {
	
	// Injects In memory proxy class obj that implements our custom repo interface
	@Autowired 
	private IActorRepo repo;

	@Override
	public String RegisterActor(Actor actor) {
		// TODO Auto-generated method stub
		return "Actor Registerd! ID: "+repo.save(actor).getAid();
	}

}
