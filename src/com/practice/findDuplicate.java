package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicate {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i<10; i++) {
			list.add(String.valueOf(i));
		}
		for(int i = 0; i<5; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("Input list : " +list);
		System.out.println("unFiltered duplicates : " +processList(list));
	}
	
	public static Set<String> processList (List<String> ListContainingDuplicates) {
		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();
		
		for (String yourInt : ListContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
	return resultSet;	
	}
	

}
