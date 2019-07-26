package com.woniu.tools;

import java.util.Random;

public class GetCode {
	
	public static String randomCode() {
		String code = "";
		Random r = new Random();
		for(int i=0; i<4; i++) {
			code += r.nextInt(10);
		}
		return code;
	}
}
