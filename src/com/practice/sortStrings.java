package com.practice;

import java.util.Arrays;

public class sortStrings {

	public static void main(String[] args) {

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec" };

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		showList(inputList);
		
		Arrays.sort(inputList);
		
		System.out.println("----Sorted list----");
		showList(inputList);
		
		System.out.println("----Sorted list Case sensitive----");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
    }
	
	public static void showList(String[] array) {
		for (String str : array) {
			System.out.println(str+ " ");
		}
		System.out.println();
	}
	

}
