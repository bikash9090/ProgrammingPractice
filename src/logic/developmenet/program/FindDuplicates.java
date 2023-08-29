package logic.developmenet.program;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicates {
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		for (int i = 0; i < 6; i++) {
			list.add(i);
		}
		
		System.out.println(list);
		//filterDuplicateElements(list);
		displayDuplicateElements(list);
	}
	
	public static void filterDuplicateElements(ArrayList<Integer> duplicateList) {
		HashSet<Integer> lh = new HashSet<Integer>();
		
		for(int i=0;i<duplicateList.size();i++) {
			
			
			lh.add(duplicateList.get(i));
		}
		System.out.println(lh);
	}
	
	public static void displayDuplicateElements(ArrayList<Integer> duplicate) {
		HashSet<Integer> lh = new HashSet<Integer>();
		
		for(int i=0;i<duplicate.size();i++) {
			
			if(!lh.add(duplicate.get(i))) {
				System.out.print(duplicate.get(i)+" ");
			}
		}
	}
}
