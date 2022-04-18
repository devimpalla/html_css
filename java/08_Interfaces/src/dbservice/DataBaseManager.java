package dbservice;

public final class DataBaseManager {
	private static DataBaseManager dbm = new DataBaseManager();
	
	
	public static DataBaseManager getInstance() {
		if(dbm == null) {
			System.out.println("DB 인스턴스 생성");
			dbm = new DataBaseManager();
		}
		return dbm;
	}
}
