package built_in;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class User {
	private String name;
	private int age;
	private char gen;

	public User() {
	}

	public User(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	// Room room;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGen() {
		return gen;
	}

	public void setGen(char gen) {
		this.gen = gen;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gen=" + gen + "]";
	}

}

class Room {
	private String roomNum;
	private User user;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;

	public Room() {
	}

	// 호텔 만들때 룸객체 초기화용 생성자
	public Room(User user, String roomNum, boolean empty, String checkInTime) {
		this.roomNum = roomNum;
		this.user = user;
		this.empty = empty;
		this.checkInTime = checkInTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRoomNum() {
		return roomNum;
	}

//	public void setRoomNum(String roomNum) {
//		this.roomNum = roomNum;
//	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "Room [roomNum=" + roomNum + ", user=" + user + ", empty=" + empty + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}

}

class Hotel {
	private Room[][] rooms;
	private String hotelName;

	// 생략가능 - 실행할 로직이 없고 디폴트 생성자만 사용할 경우
	public Hotel() {
		buildHotel();
	}

	public void buildHotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔이름을 입력 > ");
		this.hotelName = sc.next();
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		int roomCount = sc.nextInt();
		rooms = new Room[floorCount][roomCount];

		initRooms();
	}

	private void initRooms() {
		// 호텔 배열의 모든 값을 Room 객체로 초기화
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room(null, convertRoomNum(i, j), true, null);
//				System.out.println(rooms[i][j]); // 생성확인 테스트
//				System.out.print(rooms[i][j].getRoomNum()+"호 \t"); // 생성확인 테스트
//				System.out.print("사용자 : " + rooms[i][j].getUser() +"\t"); // 생성확인 테스트
//				System.out.print("빈방? : " + rooms[i][j].isEmpty() +"\t"); // 생성확인 테스트
//				System.out.print("입실시간 : " + rooms[i][j].getCheckInTime() +"\n"); // 생성확인 테스트
			}
		}
	}

	private String convertRoomNum(int i, int j) {
		String roomNum = "";
		if (j < 9) {
			roomNum = "0" + String.valueOf(j + 1);
		} else {
			roomNum = String.valueOf(j + 1);
		}
		return String.valueOf(i + 1) + roomNum;
	}

	public void goFrontDesk() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("\n============ " + this.hotelName + " 호텔 관리 메뉴 ============");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실상세조회 5:투숙객조회 Etc:종료");
			System.out.println("----------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();

			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		Scanner sc = new Scanner(System.in);
		String roomNum = "";
		switch (menu) {
		case 1:
			getRoomsStatus();
			break;
		case 2:
			System.out.println("입실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckIn(roomNum);
			break;
		case 3:
			System.out.println("퇴실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckOut(roomNum);
			break;
		case 4:
			System.out.println("조회할 방번호를 입력 > ");
			roomNum = sc.next();
			roomGetDetail(roomNum);
			break;
		case 5:
			System.out.println("--------투숙객 리스트---------");
			getUserList(this.rooms);
			break;
		default:
			System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
			return false;
		}
		return true;
	}

	private void getUserList(Room[][] rooms) {
		for (Room[] rooms1 : rooms) {
			for (Room room : rooms1) {
				System.out.println(room.getRoomNum() + " : ");
				System.out.println(room.getUser().getName() + "님");
			}
		}

//		for (int i = 0; i < rooms.length; i++) {
//			for (int j = 0; j < rooms[i].length; j++) {
//				if (rooms[i][j].getUser() != null) {
//					System.out.print(rooms[i][j].getRoomNum()+":");
//					System.out.println(rooms[i][j].getUser().getName() + "님");
//				}
//			}
//		}

	}

	private void roomGetDetail(String roomNum) {
		int floor = 0, room = 0;
		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		System.out.println(rooms[floor][room]);
		System.out.println(rooms[floor][room].getUser()); // 입실할 때 User 객체를 넣지 않음 > null
//		Room roomObj = rooms[floor][room];
//		System.out.println(roomObj);
//		System.out.println(roomObj.getRoomNum());
//		System.out.println(roomObj.isEmpty());
//		System.out.println(roomObj.getCheckInTime());
//		User userObj = roomObj.getUser();
//		System.out.println(userObj);
//		System.out.println(userObj.getName());
//		System.out.println(userObj.getAge());
//		System.out.println(userObj.getGen());
	}

	private void roomCheckOut(String roomNum) {
		int floor = 0, room = 0;
		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (!rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(true);
			rooms[floor][room].setUser(null); // 느슨한 연결관계를 활용하여 연결을 해제한다
			rooms[floor][room].setCheckInTime("");

			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckOutTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));

			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum + "호는 현재 빈방! > 다른방을 선택하세요!");
		}
	}

	private void roomCheckIn(String roomNum) {

		int floor = 0, room = 0;
		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(false);

			User user = getUserInfo();
			rooms[floor][room].setUser(user);
			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckInTime(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
			if (rooms[floor][room].getCheckOutTime().length() > 0) {
				rooms[floor][room].setCheckOutTime("");
			} 
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum + "호는 현재 사용중! > 다른방을 선택하세요!");
		}
	}

	private User getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("투숙객의 정보를 입력해야 합니다!");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);

//		User user = new User(name, age, gen);
		return new User(name, age, gen);
	}

	private void getRoomsStatus() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + "호:");
				System.out.print(rooms[i][j].isEmpty() ? "입실가능" : "사용중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

public class HotelMgr {

	public static void main(String[] args) {
		Hotel hotel = new Hotel(); // 호텔 객체 생성
		hotel.goFrontDesk(); // getMenu(); 호텔이용 메뉴 선택
	}
}