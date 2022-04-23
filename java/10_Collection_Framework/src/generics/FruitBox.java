package generics;

public class FruitBox {

	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<>();
		Box<Apple> appleBox = new Box<>();
//		Box<Toy> toyBox = new Box<>();
		
		// Box<Apple> appleBox2 = new Box<Orange>(); // Error, Generics에 의해 타입제한
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Orange()); // extends 되서 fruit의 자식이니까 가능! (상속도 허락)
		fruitBox.add(new Apple());
		
		// fruitBox.add(new Toy()); // fruit 타입과 연관성이 없으므로 Error
		//toyBox.add(new Apple()); // 이것두 마찬가지 toy랑 연관성 없어서 Error
		
		
	}

}
