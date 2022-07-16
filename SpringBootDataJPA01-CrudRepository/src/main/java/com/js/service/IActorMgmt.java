package com.js.service;

import java.util.List;

import com.js.entity.Actor;

public interface IActorMgmt {
	public String RegisterActor(Actor actor);
	public String BulkRegister(Iterable<Actor> list);
}
