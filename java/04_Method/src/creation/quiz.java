package creation;

public class quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수를 5개를 배열로 만들어
		// 그 배열을 메서드에 전달하면
		// 평균을 연산후 리턴받아
		// 출력하는 코드를 작성하세요
		// 1. 랜덤으로 정수 5개를 만드는 메서드
		// 2. 평균을 연산하는 메서드
		
		int[] datas = makeArr();
		int result = calculateAvg(datas);
		
		System.out.print("[");
		for (int i = 0; i < datas.length; i++) {
			System.out.print(datas[i]+" ");
		}
		System.out.print("]\n");
		System.out.println("평균: "+result);

	}

	private static int calculateAvg(int[] datas) {
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < datas.length; i++) {
			sum+=datas[i];
		}
		avg=sum/5;
		int result = (int)avg;
		return result;
	}

	private static int[] makeArr() {
		int[] datas = new int[5];
		for (int i = 0; i < datas.length; i++) {
			datas[i]=(int)(Math.floor(Math.random()*45)+1);
		}
		return datas;
	}

}
