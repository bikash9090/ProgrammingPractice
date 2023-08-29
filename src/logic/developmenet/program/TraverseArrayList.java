package logic.developmenet.program;

import java.util.ArrayList;

public class TraverseArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(20);
		al.add(45);
		al.add(4);
		al.add(98);
		al.add(55);
		al.add(576);
		
		al.add(4,558);
		al.add(4,550);
		al.add(4,55067);
		
		for(Integer num:al) {
			System.out.println(num);
		}

	}

}
