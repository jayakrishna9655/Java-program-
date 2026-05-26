package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class data {
	@Autowired
	Laptop lap;
	
      public void code() {
		System.out.println("it working jai");
		
		lap.compile();
	}
}
