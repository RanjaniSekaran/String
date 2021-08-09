package Stringtypes;

import java.util.Scanner;

public class NameLiteral {
public static void main(String[] args) {
	String s="Ranjani";String s2="Ranjani";
//	Scanner sc =new Scanner (System.in);
//	System.out.println("Enter 3rd String");
//	String s3 = sc.nextLine();
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s2));
//	System.out.println(System.identityHashCode(s3));
	boolean r = s.equals(s2);
	System.out.println(r);
	boolean rr = s==s2;
	System.out.println(rr);

	
	String s4=new String("Karthik");
	String s5=new String("Karthik");
	
	System.out.println(System.identityHashCode(s4));
	System.out.println(System.identityHashCode(s5));
	boolean ra = s4.equals(s5);
	System.out.println(ra);
	
	boolean rk = s4==s5;
	System.out.println(rk);
	
	int compareTo = s2.compareTo(s4);
	System.out.println(compareTo);

}
}
