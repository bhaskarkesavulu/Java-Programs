package com.basic;
public class StringReverse {
	public static void main(String[] args) {
		/*String input = "MalayalaM";
		StringBuilder input1 = new StringBuilder();
		input1.append(input);
		input1 = input1.reverse();
		System.out.println(input1);
		
		String s = "Bhaskar";
		StringBuffer s1 = new StringBuffer();
		s1.append(s);
		s1.reverse();
		System.out.println(s1);*/
		
		/*String input = "UDNAP"; 
	        char[] try1 = input.toCharArray(); 
	        for (int i = try1.length-1; i>=0; i--) 
	            System.out.print(try1[i]); */
		
		String s1 = "UDNAP";
		StringBuffer sb = new StringBuffer(s1);
		System.out.println(sb.reverse());
		
	}
}
