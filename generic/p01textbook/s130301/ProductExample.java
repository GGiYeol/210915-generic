package p13.generic.p01textbook.s130301;

public class ProductExample {
	//659 page
	//타입 파라미터로 타입을 나중에 설정해 줄 수 있다.
	public static void main(String[] args) {
		Product<Tv, String>	product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("스마트 티비");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		Product<Car, String>product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("디젤");
		Car car =  product2.getKind();
		String carModel = product2.getModel();
		
	}
	
}

class Tv{
	
}
class Car{
	
}