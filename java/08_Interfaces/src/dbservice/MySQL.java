package dbservice;

public class MySQL implements DataBase {
	private DataBaseManager dbm;
	
	public MySQL() {
		this.dbm = DataBaseManager.getInstance();
	}

//	@Override
//	public void connect() {
//		System.out.println("MySQL 데이터베이스에 접속하였습니다.");
//
//	}

	@Override
	public void select() {
		System.out.println("MySQL 데이터베이스를 조회하였습니다.");

	}

	@Override
	public void insert() {
		System.out.println("MySQL 데이터베이스에 데이터를 입력하였습니다.");

	}

	@Override
	public void update() {
		System.out.println("MySQL 데이터베이스의 데이터를 수정하였습니다.");

	}

	@Override
	public void delete() {
		System.out.println("MySQL 데이터베이스의 데이터를 삭제하였습니다.");

	}

}
