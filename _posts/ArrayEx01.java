package arrayex;

/*
 * 2차원 배열을 이용해 다음과 같이 출력하시오.
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		int a = 4; // 행
		int b = 5; // 열
		int[][] n = new int[a][b];

		System.out.print(n);
	}

}
