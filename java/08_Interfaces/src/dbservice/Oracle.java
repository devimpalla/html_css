package dbservice;

public class Oracle implements DataBase {
	private DataBaseManager dbm; // 추후에 실제 오라클 데이터베이스와 연동되는 Connectivity 구현체
	
	public Oracle() {
		this.dbm = DataBaseManager.getInstance();
	}

//	@Override
//	public void connect() {
//		System.out.println("오라클 데이터베이스에 접속하였습니다...");
//
//	}

	@Override
	public void select() {
		System.out.println("오라클 데이터베이스를 조회하였습니다");

	}

	@Override
	public void insert() {
		System.out.println("오라클 데이터베이스에 데이터를 입력하였습니다");

	}

	@Override
	public void update() {
		System.out.println("오라클 데이터베이스의 데이터를 수정하였습니다");

	}

	@Override
	public void delete() {
		System.out.println("오라클 데이터베이스의 데이터를 삭제하였습니다");

	}

}
