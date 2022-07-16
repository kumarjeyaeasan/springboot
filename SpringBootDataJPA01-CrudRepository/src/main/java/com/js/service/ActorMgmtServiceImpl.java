package com.js.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	/*
	@Override
	public String BulkRegister(Iterable<Actor> list) {
		if(list!=null) {
			Iterable<Actor> itr = repo.saveAll(list);
			
			List<Integer> l = new ArrayList();
			for(Actor actor:itr) {
				
				l.add(actor.getAid());
			}
			return l.size()+"records are saved:: "+l;
		}
		return "Empty List:: No records saved";
	}
	*/

	public String BulkRegister(Iterable<Actor> list) {
		
		if(list!=null) {
			List<Actor> listA = (List<Actor>)repo.saveAll(list);
			List<Integer> ids = listA.stream().map(actor->actor.getAid()).collect(Collectors.toList());
			return ids.size()+"records are saved:: "+ids;
		}
		
		return "Empty List:: No records saved";
	}


}
