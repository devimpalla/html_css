package basic;

public abstract class Electronic { // 전자제품 개념의 클래스
 protected boolean power;
 protected int button;
 protected String feature;
 
 abstract void buttonColor(String color); // 추상메서드 어떤 색인지 넣는거만 필요하지
 // 저 색을 넣었을때 뭘 해야한다 이런건 필요 없으니까 실행영역이 없어
 
 public boolean isPower() {
	 return power ? true: false;
 }
 public int getButton() {
	 return this.button;
 }
 
 public String getFeature() {
	 return this.feature;
 }
public void setPower(boolean power) {
	this.power = power;
}
public void setButton(int button) {
	this.button = button;
}
public void setFeature(String feature) {
	this.feature = feature;
}
 
}
 
 
