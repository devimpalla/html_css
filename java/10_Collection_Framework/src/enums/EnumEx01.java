package enums;

public class EnumEx01 {

	public static void main(String[] args) {
		Directions d1 = Directions.EAST;
		Directions d2 = Directions.WEST;
		Directions d3 = Directions.valueOf("SOUTH"); // valueOf는 스트링을 반환함
		Directions d4 = Enum.valueOf(Directions.class, "NORTH");
		Directions d5 = Directions.valueOf("EAST");
		Directions d6 = Enum.valueOf(Directions.class,"WEST");
		Directions d7 = Enum.valueOf(Directions.class, "SOUTH");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		System.out.println(d1 == d2);
		System.out.println(d3 == d4);
		System.out.println(d1 == d5);
		System.out.println(d2 == d6);
		System.out.println(d3 == d7);
		System.out.println(d3.equals(d7));
		
		Directions[] dirArr = Directions.values();
		
		for (Directions dirs : dirArr) {
			System.out.println(dirs.name() + " : " + dirs.ordinal());
			// 인덱스 번호 파악
		}
	}

}
