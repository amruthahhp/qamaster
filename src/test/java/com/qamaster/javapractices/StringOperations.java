package com.qamaster.javapractices;

public class StringOperations {
	
	public static void main(String[] args) {
		String str = " java python sel neon";
		String str2 = " Number";
		System.out.println(str2);
		System.out.println(str2.trim());
		String[] arrayStr = str.split("python");
		for(String strnew : arrayStr) {
			System.out.println(strnew);
		}
	}
}
