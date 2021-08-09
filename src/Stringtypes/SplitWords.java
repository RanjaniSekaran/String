package Stringtypes;

public class SplitWords {
public static void main(String[] args) {
	String s="Welcome to java class";
	String[] s1 = s.split("l");
	/* String[] s1 = s.split(" ");
	 * output:
	Welcome
	to
	java
	class*/
	
	for(String s2:s1) {
		System.out.println(s2);
	}
	
	for (int i = 0; i < s1.length; i++) {
		
	}
}
}
