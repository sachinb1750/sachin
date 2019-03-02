package com.sachin.demoJersey;

import java.util.ArrayList;
import java.util.List;

public class friendsRepository {
	List<friends> friendsList;
	
	public friendsRepository() {
		friendsList = new ArrayList<friends>();
		friends f1 = new friends();
		f1.setId(1);
		f1.setName("Sachin Bhardwaj");
		f1.setPoints(60);
		
		friends f2 = new friends();
		f2.setId(2);
		f2.setName("Pooja Panchal");
		f2.setPoints(90);
		
		friendsList.add(f1);
		friendsList.add(f2);
	}
	public friends getFriends(int id) {
		friends f1=null;
		
		for(friends a: friendsList) {
			if(a.getId()==id)
				return a;
		}
		
		return null;
	}
	public List<friends> getFriendsList() {
		// TODO Auto-generated method stub
		return friendsList;
	}
	public void create(friends f1) {
		friendsList.add(f1);
	}
}
