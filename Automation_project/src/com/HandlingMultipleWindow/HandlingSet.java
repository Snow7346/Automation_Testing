package com.HandlingMultipleWindow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HandlingSet {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		
		s.add("Arun");
		s.add("Gokul");
		s.add("Karthik");
		s.add("Abbas");
		s.add("Arun");
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
