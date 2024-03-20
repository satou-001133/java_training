package Lesson1;

class Lesson3{
	public static void main(String[] args) {
//　xとyには任意の値を設定。
		int x = 5;
		int y = 7;
		int a = x + y;
//　x＋yは、A
		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
// 入れ替えとはイコールで問題なし？
		x = y;
		System.out.println("xとyを足すと" + a + "になる");
	}
}
