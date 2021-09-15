package p13.generic.p03lecture.p02generic;

public class Ex01 {
	 public static void main(String[] args) {
		Box<String> b1;
		Box<Integer> b2;
		
		b1 = new Box<String>();
		b2 = new Box<Integer>();
		
//		b1.setItem(33);
//		b2.setItem("java");
		
		b1.setItem("java");
		b2.setItem(333);
		
		String s = b1.getItem();
		Integer i = b2.getItem();
		
		System.out.println(s.length());
		System.out.println(i.intValue());
	}
}

class Box<T>{ //클래스가 정의 될 당시에는 특정 지어지지 않지만, 객체를 만들때 명시되어 진다.
	//알파벳은 상관 없음.하지만 타입 파라미터로 보통 T로 씀.(관습상 한글자 대문자로 씀)
	private T item;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
}