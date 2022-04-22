package enums;

public class EnumEx02 {

	public static void main(String[] args) {
		for (Direction dir : Direction.values()) {
			System.out.println(dir.name() + " : " + dir.getValue() + " : " + dir.getSign());
		}
		
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.ofDirection(1);
		
		System.out.println(d1.name() + " : " + d1.getValue() + " : " + d1.getSign());
		System.out.println(d2.name() + " : " + d2.getValue() + " : " + d2.getSign());
		
		System.out.println("------------------------");
		
		System.out.println(Direction.EAST.rotate(1));
		System.out.println(Direction.EAST.rotate(2));
		System.out.println(Direction.EAST.rotate(-1));
		System.out.println(Direction.EAST.rotate(-2));
	}

}
