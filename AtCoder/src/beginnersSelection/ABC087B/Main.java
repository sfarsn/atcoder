package beginnersSelection.ABC087B;

import java.util.Scanner;

public class Main {
	/*問題文
	あなたは、500 円玉を A 枚、100 円玉を B 枚、50 円玉を C 枚持っています。 これらの硬貨の中から何枚かを選び、合計金額をちょうど X 円にする方法は何通りありますか。
	同じ種類の硬貨どうしは区別できません。2 通りの硬貨の選び方は、ある種類の硬貨についてその硬貨を選ぶ枚数が異なるとき区別されます。
	
	制約
	0≤A,B,C≤50
	A+B+C≥1
	50≤X≤20,000
	A,B,C は整数である
	X は 50 の倍数である
	
	入力
	入力は以下の形式で標準入力から与えられる。
	A
	B
	C
	X
	出力
	硬貨を選ぶ方法の個数を出力せよ。*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(), B = scanner.nextInt(), C = scanner.nextInt(), X = scanner.nextInt(), result = 0;

		for (int i = 0; i <= A; i++) {
			for (int j = 0; j <= B; j++) {
				for (int k = 0; k <= C; k++) {
					if (500 * i + 100 * j + 50 * k == X) {
						result++;
					}
				}
			}
		}
		System.out.println(result);
	}

}
