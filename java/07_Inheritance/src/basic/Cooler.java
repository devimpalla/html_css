package basic;

public abstract class Cooler extends Electronic { // 쿨링 개념의 클래스
	@Override
	public boolean isPower() {
		return super.isPower();
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
		System.out.println("냉장 버튼 추가");
		super.button = button;
	}
	@Override
	public void setFeature(String feature) {
		System.out.println("냉장 과학 추가");
		super.feature = feature;
	}
	@Override
	public String toString() {
		return "This is Cooler";
	}
	 
}
