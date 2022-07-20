package beginnersSelection.ABC081B;

import java.util.Scanner;

public class Main {

	/*問題文
	黒板に N 個の正の整数 A1,...,ANが書かれています．
	すぬけ君は，黒板に書かれている整数がすべて偶数であるとき，次の操作を行うことができます．
	黒板に書かれている整数すべてを，2 で割ったものに置き換える．
	すぬけ君は最大で何回操作を行うことができるかを求めてください．
	制約
	1≤N≤200
	1≤Ai≤109
	入力
	入力は以下の形式で標準入力から与えられる。
	N
	A1A2...AN
	出力
	すぬけ君は最大で何回操作を行うことができるかを出力せよ．
	*/
	public static void main(String[] args) {
		Scanner scannser = new Scanner(System.in);
		int n = scannser.nextInt();
		scannser.nextLine();
		String str = scannser.nextLine();
		String[] N = str.split(" ");
		int count = 0, A, fin = 0;
		while (fin == 0) {
			for (int i = 0; i < n; i++) {
				A = Integer.parseInt(N[i]);
				if (A % 2 == 1) {
					fin = 1;
					break;
				} else {
					N[i] = Integer.toString(A / 2);
					if (i == n - 1) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
