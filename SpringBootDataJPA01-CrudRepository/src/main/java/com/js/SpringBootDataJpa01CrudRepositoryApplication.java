package com.js;

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
		actor.setAname("Ajit");
		actor.setCategory("Hero");
		actor.setMobileno(8888888l);
		try {
			System.out.println(service.RegisterActor(actor));
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
