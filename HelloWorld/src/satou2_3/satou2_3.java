package satou2_3;
class satou2_3
{
	public static void main(String[] args) 
	{
//　XとYには任意の値を設定。
		int X;
		X = 5;
		int Y;
		Y = 7;
		int A;
//　X＋Yは、A
		A = X+Y;
		System.out.println("Xの値は" + X + "です。");
		System.out.println("Yの値は" + Y + "です。");
// 入れ替えとはイコールで問題なし？
		X = Y;
		System.out.println("XとYを足すと" + A + "になる");
	}
}