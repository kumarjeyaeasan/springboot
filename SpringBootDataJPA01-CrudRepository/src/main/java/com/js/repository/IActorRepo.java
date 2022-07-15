package com.js.repository;

import org.springframework.data.repository.CrudRepository;

import com.js.entity.Actor;


public interface IActorRepo extends CrudRepository<Actor, Integer> {
	//<Actor => Entity Class Name
	//< , Integer> => Entity Class @ID Property's Type
}
