package week3assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PayPalIndia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str = "paypal india";
	char[] chr = str.toCharArray();
	//System.out.println(chr);
	Set<Character> charSet = new HashSet<Character>();
	Set<Character> dupcharSet = new HashSet<Character>();
	
	for (int i = 0; i < chr.length; i++) {
		//charSet.add(chr[i]);
		
		if (charSet.contains(chr[i])) {
			
			dupcharSet.add(chr[i]);
			charSet.remove(chr[i]);
		}
		else
			
			charSet.add(chr[i]);
		}
	
	System.out.println("CharacterSet:" +charSet);
	System.out.println("Duplicate CharacterSet:" +dupcharSet);
	charSet.remove(' ');
	
	List<Character> list = new ArrayList<Character>(charSet);
	for (int j = 0; j < charSet.size() ; j++) {
	
		System.out.println(list.get(j));
		
	}
		
	}

	}


