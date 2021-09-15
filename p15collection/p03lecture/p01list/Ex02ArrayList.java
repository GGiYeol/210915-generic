package p15collection.p03lecture.p01list;

import java.util.ArrayList;

public class Ex02ArrayList {
	public static void main(String[] args) {
		//기본타입은 들어가지 않는다. 참조타입만 넣어야함. 기본 타입은 객체가 아니기때문
		ArrayList<Integer> arr1 = new ArrayList<>();
		//add-> list의 끝부분에 사용한다. 투입 순서대로 들어감
		arr1.add(999);//자동 박싱되어서 들어간다.
		arr1.add(888);
		arr1.add(777);
		//size-> 배열의 사이즈
		System.out.println(arr1.size());
		arr1.add(111);
		arr1.add(222);
		
		System.out.println(arr1.size());
		//get ->인덱스 번호로 무엇이 들어가있는지 알 수 있음
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		System.out.println(arr1.get(4));
		
		//remove
		arr1.remove(3);
		System.out.println(arr1.size());
		//인덱스가 사라지면 인덱스가 땡겨진다.
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(1));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
	}
}
