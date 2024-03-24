package Lesson1;
/**
 * 実力確認問題　2．演算子
 **/
class Lesson3{
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int a = x + y;

        System.out.println("xの値は" + x + "です。");
        System.out.println("yの値は" + y + "です。");

        // xとyの値を入れ替える
        int temp = x;
        x = y;
        y = temp;

        System.out.println("xとyを入れ替えると、xの値は" + x + "、yの値は" + y + "になります。");
    }
}