package com.qamaster.javapractices;

import java.util.ArrayList;
import java.util.List;

public class ArrayVsArrayList {
	
	public static void main(String[] args) {
		
		String[] arrayEx = new String[5];
		arrayEx[0]="Java";
		arrayEx[1]="Python";
		arrayEx[2]="Selenium";
		arrayEx[3]="Playwright";
		arrayEx[4]="VisualStudio";
		
		for(String str : arrayEx) {
			System.out.println(str);
		}
	
	List<Integer> alist = new ArrayList<Integer>();
	alist.add(7);
	alist.add(8);
	alist.add(9);
	alist.add(10);
	alist.add(7);
	alist.add(7);
	for(int a : alist) {
		System.out.println(a);
	}
	
	}
}
