package beginnersSelection.PracticeA;

import java.util.Scanner;

/**
 * @author akinori
 */

/*
 * 問題概要
 * 実行時間制限: 2 sec / メモリ制限: 256 MB
 * 問題文
 * 高橋君はデータの加工が行いたいです。
 * 
 * 入力形式
 * a
 * b c
 * s 
 * 
 * 出力
 * 整数 a,b,cと、文字列 s が与えられます。 a+b+c の計算結果と、文字列 s を並べて表示しなさい。
 * 
 * 制約
 * 1≤a,b,c≤1,000
 * 1≤∣s∣≤100
 * 
 */
public class Main {

	/**
	 * mainメソッド
	 * @parameter args 使用しない
	 */
	public static void main(String[] args) {
		//標準入力
		Scanner scanner = new Scanner(System.in);
		//整数、文字列　コンソール入力
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String s = scanner.next();
		//出力
		System.out.print((a + b + c) + " " + s);
	}

}
