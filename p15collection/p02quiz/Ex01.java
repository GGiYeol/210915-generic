package p15collection.p02quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		while(run)	{
			System.out.print("l: list,e: exit 입력>");
			String a = scan.nextLine();		
			if(a.equals("r")) {
				if(list.size()>0) {
				list.remove(list.size()-1);
				} else {
					System.out.println("삭제할 값이 없습니다.");
				}
			}else if(a.equals("l")) {
				for(int i =0; i<list.size();i++) {
					System.out.println(list.get(i));
				}
			}  else if(a.equals("e")) {
				run = false;
				break;
			}
			list.add(a);
		}
	}
}
