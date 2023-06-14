package org.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gayathri {

	public static void main(String[] args) {
		
		List <Integer> li = new LinkedList<>();
		
		li.add(10);
		li.add(40);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(20);
		li.add(50);
		
		System.out.println(li);
		
		for (int i = 0; i < li.size(); i++) {
			Integer in = li.get(i);
			System.out.println(in);
		}
		
		for (Integer x : li) {
			
			System.out.println(x);
			
		}
		
		boolean con = li.contains(40);
		System.out.println(con);
		
		//8.
		li.remove(1);
		System.out.println(li);
		
		//9.
		li.removeAll(li);
		System.out.println(li);
		
		//
		boolean empty = li.isEmpty();
		System.out.println(empty);
		
		List<Integer> l = new ArrayList<>();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}