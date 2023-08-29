package logic.developmenet.program;

import java.util.ArrayList;

public class ConvertArrayListToString {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Bikash");
		al.add("Shiv");
		al.add("bks");
		al.add(0, "Rakesh");
		
		String[] str = new String[al.size()];
		
		//To convert from arraylist to string.
		for(int i=0;i<al.size();i++) {
			str[i] = al.get(i);
		}
		
		//To print the elements inside the string.
		for(String s:str) {
			System.out.println(s);
		}
	}

}
