package com.qamaster.javapractices;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPractice {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("Maven");
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Object current = iterator.next();
			System.out.println("The current value is "+ current);
		}
		
	}

}
