package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			
			System.out.print("0 : 종료, 1: 출력 점수(50이상>");
			int score = scan.nextInt();
			switch (score) {
			case 1 :
					for(Integer a : list) {
						System.out.println(a);
				}
				
				break;
			case 2:
				if(!list.isEmpty()) {
					list.remove(list.size()-1);
				}
			case 3:
				int b = 0;
				for(int i =0; i<list.size();i++) {
					b = b + list.get(i);
				}
				System.out.println(b);
				break;
			case 4:
				int b1 = 0;
				for(int i =0; i<list.size();i++) {
					b1 = b1 + list.get(i);
				}
				System.out.println(b1 / list.size());
				break;
			
			

				
			case 0 : 
				run = false;
				break;
			default:
				if(score >=50) {
				list.add(score);
				}
				int max = Collections.max(list);
				System.out.println("최대값:" + max);
				int min = Collections.min(list);
				System.out.println("최소값:" + min);
				System.out.println("합계:" );

				break;
			}
		
		
		}
	
	}
	
}
