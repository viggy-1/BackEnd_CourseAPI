package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;

public class Demo {

	ArrayList<Topic> a=new ArrayList<>();
	
	//constructor for class Demo
	public Demo() {
		
		//
		Topic topic1= new Topic("1","HTML","HTML Framework");
		Topic topic2= new Topic("2","CSS","CSS Framework");
		Topic topic3 =new Topic("3","DBMS","DBMS Framework");
		a.add(topic1);
		a.add(topic2);
		a.add(topic3);
	}
}
