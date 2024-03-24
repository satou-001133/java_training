package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson2_1 {
    public static void main(String[] args) throws IOException {
        System.out.print("成績を入力してください。");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        char ans = (res == 1) ? 'A' : 'B'; // 三項演算子の構文が修正されました
        System.out.println(ans + "を選択しました。");
    }
}
