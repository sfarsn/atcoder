package beginnersSelection.ABC086A;

import java.util.Scanner;

public class Main {
	/**
	 * 		問題文
	 * シカのAtCoDeerくんは二つの正整数 a,b を見つけました。 a と b の積が偶数か奇数か判定してください。
	 * 制約
	 * 1 ≤ a,b ≤ 10000
	 * a,b は整数
	 * 入力は以下の形式で標準入力から与えられる。
	 * a b
	 * 出力
	 * 積が奇数なら Odd と、 偶数なら Even と出力せよ。
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int Anser = a * b;
		switch (Anser % 2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
		}
	}

}
