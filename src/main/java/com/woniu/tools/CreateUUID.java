package com.woniu.tools;

public class CreateUUID {
	
	public static String getUUID() {
		java.util.UUID uuid = java.util.UUID.randomUUID();
		String newUUID = uuid.toString().replace("-", "");
		return newUUID;
	}
	
	public static void main(String[] args) {
		System.out.println(CreateUUID.getUUID());
	}
}
