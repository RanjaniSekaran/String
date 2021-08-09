package Stringtypes;

public class CountVOwelsConsonants {
	public static void main(String[] args) {
		String s="Welcome";
		int length = s.length();
		//char[] bb = s.toCharArray();
		//System.out.println(bb);
		
		
		System.out.println("Length Of String"+length);
		/*char a = s.charAt(0);char b = s.charAt(1);char c = s.charAt(2);
		char d = s.charAt(3);char e = s.charAt(4);char f = s.charAt(5);
		char g = s.charAt(6);*/
		int a=0,b=0;
				for (int i = 0; i < length; i++) {
					char n = s.charAt(i);
					if (n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
						a++;
						
					} else {
b++;
					}
					
				}
				System.out.println("Vowels Count  "+a);
				System.out.println("Consonants  "+b);
	}

}
