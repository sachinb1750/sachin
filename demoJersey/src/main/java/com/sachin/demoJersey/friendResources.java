package com.sachin.demoJersey;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;
@Path("friends")
public class friendResources {
	friendsRepository repo = new friendsRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<friends> getFriends() {
		System.out.println("Friend is called");
		/*
		 * friends f1 = new friends(); f1.setName("Sachin"); f1.setPoints(60);
		 * 
		 * friends f2 = new friends(); f2.setName("Bhardwaj"); f2.setPoints(90);
		 * 
		 * List<friends> friendsList = Arrays.asList(f1,f2);
		 * 
		 * 
		 * // return f1; return friendsList;
		 */
		return repo.getFriendsList();
		
	}
//	@Produces(MediaType.APPLICATION_XML)
	@GET
	@Path("friends/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public friends getFriend(@PathParam("id") int id) {
		System.out.println("ID");
		return repo.getFriends(id);
	}
	/*
	 * public friends getFriends() { System.out.println("Friend is called"); friends
	 * f1 = new friends(); f1.setName("Sachin"); f1.setPoints(60); return f1;
	 * 
	 * }
	 */
	@POST
	@Path("friendsAdd")
	public friends createFriends(friends f1) {
		System.out.println(f1);
		repo.create(f1);
		return f1;
	}
}
