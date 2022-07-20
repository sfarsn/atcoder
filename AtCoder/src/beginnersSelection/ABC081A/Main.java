package beginnersSelection.ABC081A;

import java.util.Scanner;

public class Main {

	/**
	 * 問題文
	 * すぬけ君は 1,2,3 の番号がついた 3 つのマスからなるマス目を持っています。
	 * 各マスには0か1が書かれており、マスiにはsiが書かれています。
	 * すぬけ君は 1 が書かれたマスにビー玉を置きます。 ビー玉が置かれるマスがいくつあるか求めてください。
	 * 制約
	 * s 1,s 2,s 3は 1 あるいは 0
	 * 入力
	 * 入力は以下の形式で標準入力から与えられる。
	 * s1 s2 s3
	 * 出力
	 * 答えを出力せよ。
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scannser = new Scanner(System.in);
		int s = scannser.nextInt();
		int s1 = s / 100;
		int s2 = (s - s1 * 100) / 10;
		int s3 = s - s1 * 100 - s2 * 10;
		System.out.println(s1 + s2 + s3);
	}

}
