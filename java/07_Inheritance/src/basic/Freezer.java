package basic;

public abstract class Freezer extends Cooler { // 아이싱 개념 클래스
	
	@Override
	public boolean isPower() {
		return super.isPower();
	}
	@Override
	void buttonColor(String color) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getButton() {
		return super.button;
	}
	
	@Override
	public String getFeature() {
		return super.getFeature();
	}
	@Override
	public void setButton(int button) {
		System.out.println("냉동 버튼 추가");
		super.button = button;
	}
	@Override
	public void setFeature(String feature) {
		System.out.println("냉동 과학 추가");
		super.feature = feature;
	}
	@Override
	public String toString() {
		return "This is Freezer";
	}
	 
}
