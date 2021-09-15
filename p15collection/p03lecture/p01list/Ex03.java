package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("aaa");
		list.add("aa");
		list.add("a");
		
		System.out.println(list.size());
		
		//for
		for(int i =0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.add("bb");
		list.add("bbb");
		System.out.println(list.size());
		//향상된 for
		for(String str : list) {
			System.out.println(str);
		}
		//forEach(lambda)
		list.forEach(str -> System.out.println(str));
		//toString
		System.out.println(list);
	
	}
}
