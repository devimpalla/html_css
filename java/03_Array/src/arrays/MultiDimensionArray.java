package arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// 다차원 배열 구조
		// [[1],[2],[3]] //2차원배열 => 1차원 배열의 길이는?3, 2차원 배열의 길이는 1
		// [[[1],[2],[3]],[[4],[5],[6]],[[7],[8],[9]]] // 3차원 배열
		// 1차원 배열의 길이는 3, 2차원 배열의 길이는 3, 3차원 배열의 길이는 1
		
		//2차원 배열의 선언
		int[][] intArr2D = new int[4][2];
		int[][] intArr2DV = new int[4][]; // 1차원의 길이는 필수 2차원의 길이는 선택(가변배열) // 잘 사용하지 않음
		
		System.out.print("[");
		for (int i = 0; i < intArr2D.length; i++) {
			System.out.print("[");
			for (int j = 0; j < intArr2D[i].length; j++) {
				intArr2D[i][j]=(int)(Math.floor(Math.random()*100))+1;
				System.out.print(intArr2D[i][j] + " ");
			}
			System.out.print("]");
		}
		System.out.print("]");
		
		// 2차원 배열의 선언 및 초기화 with value
		String[][] strArr = {{"A","B","C"},{"D","E","F"},{"G","H","I"}};
	}

}
