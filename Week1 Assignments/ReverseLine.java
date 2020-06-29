package week1assignment;

public class ReverseLine {
	
	public static String reverseWord(String str){  
	    String words[]=str.split(" ");  
	    String reverseWord=" ";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    return reverseWord.trim();  
	}  

	public static void main(String[] args) {
		System.out.println(ReverseLine.reverseWord("I am a software tester"));

	}

}
