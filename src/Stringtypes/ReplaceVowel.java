package Stringtypes;

public class ReplaceVowel {
	public static void main(String[] args) {
		/*String s="Welcome";
		String a = s.replace('e', '@');
		String b = s.replace('o', '@');
		System.out.println("Replaced word is "+a+b);
		output - 2 separate output */
		String s="Welcome aeiou";
		int length = s.length();
		String a=null;
				
				for (int i = 0; i < length; i++) {
					char n=s.charAt(i);
					if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
						 s = s.replace(n,'@');
					System.out.println(s);
					}
					
				}
				System.out.println("Vowels Count  "+ s);
				
	}


	
	}

