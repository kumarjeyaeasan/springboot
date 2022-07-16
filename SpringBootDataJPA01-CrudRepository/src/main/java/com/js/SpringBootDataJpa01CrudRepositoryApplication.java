package com.js;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.dao.DataAccessException;

import com.js.entity.Actor;
import com.js.service.ActorMgmtServiceImpl;
import com.js.service.IActorMgmt;

@SpringBootApplication
public class SpringBootDataJpa01CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootDataJpa01CrudRepositoryApplication.class, args);
		IActorMgmt service = ctx.getBean("ActorService", ActorMgmtServiceImpl.class);
		
		Actor actor = new Actor();
		//actor.setAid(1); // - If Existing ID is used, it will UPDATE
		actor.setAname("Rajni");
		actor.setCategory("Star!");
		actor.setMobileno(9999999999l);
		
		List<Actor> aList = List.of(new Actor(1001,"Rajni","Hero",33333l), new Actor(1001,"Ajith","Hero",44444l));
		
		try {
			System.out.println(service.RegisterActor(actor));
			System.out.println(service.BulkRegister(aList));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
