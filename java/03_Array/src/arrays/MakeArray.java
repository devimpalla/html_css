package arrays;

public class MakeArray {

	public static void main(String[] args) {
		// 배열은 타입과 크기가 설정되어야 한다! (중요!)
		
		Object[] obj;
		
		boolean[] boolArr; // 배열의 선언
		boolArr = new boolean[5]; // 변수를 사용할 때는 반드시 크기가 정해진 형태로 사용하여야 함!!
		int[] intArr = new int[12]; // 배열의 선언 및 초기화
		String[] strArr = {"Zero","One","Two","Three","Four"}; // 배열의 선언 및 초기화 with value
		
		double doubleArr[] = new double[10]; // 되기는 하는데 이렇게 안씀 가독성 안좋음
		
		// 배열의 인덱스 번호는 0번 부터 시작
		// 배열의 마지막 인덱스 번호는 항상 배열의 길이에서 -1을 한 값
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random()*100))+1;
			System.out.print(intArr[i]+" ");
		}
		
	}

}
