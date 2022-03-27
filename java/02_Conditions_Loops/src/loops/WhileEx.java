package loops;

public class WhileEx {

	public static void main(String[] args) {
		//1~15의 합 구하기
		int i = 1;
		int sum = 0;
		
		while (i<16) {
			sum += i;
			System.out.println(i+"=>" + sum);
			i++;
		}
		
		int j=1;
		int sum2 = 0;
		do {
			sum2 += j;
			System.out.println(j +"=>" + sum2);
			j++;
		}
		while(j < 16);
	}

}
