package dbservice;

public class WebService implements Service {
	private DataBase dbv;
	
	public WebService() {
		this.dbv = new Oracle();
	}
	
	
	@Override
	public void read() {
		dbv.select();

	}

	@Override
	public void create() {
		dbv.insert();

	}

	@Override
	public void edit() {
		dbv.update();

	}

	@Override
	public void remove() {
		dbv.delete();

	}

}
