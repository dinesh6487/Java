package com.dinesh.elumalai.java.alg.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABC1$SWD@@";
		char[] ch = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = ch.length-1; i >= 0; i--) {
			if((""+ch[i]).matches("[a-zA-Z]"))
			sb.append(ch[i]);
		}
		
		System.out.println(sb.toString());

	}

}
