package p13.generic.p03lecture.p01notgeneric;

public class Ex01 {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		
		b1.setItem("java");
		String s = (String)b1.getItem();
		
		System.out.println("아이템길이:" + s.length());
		//오토 언박싱
		b1.setItem(3);
		//다형성. object는 integer가 아니기 때문.->강제형변환 필요
		Integer i = (Integer)b1.getItem();
		System.out.println("아이템 값:" + i);
		
		b1.setItem("html");
		Integer j = (Integer)b1.getItem(); //ClassCastException발생함.(integer는
	}
}
//실제 실행되는 메소드는 인스턴스 메소드. 상위타입으로 자동 형변환 ->다형성으로 인해 생기는 일
class Box{
	private Object item;
	
	public void setItem(Object item) {
		this.item = item;
	}
	
	public Object getItem() {
		return item;
	}
}