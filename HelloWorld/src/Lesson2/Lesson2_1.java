package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * 実力確認問題　2．for if文
 **/
class Lesson2_1{
	public static void main(String[] args)throws IOException{
		System.out.println("試験の点数を入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);

		//【ケース 1】
        // 60 点以上：「合格」
		// 60 点未満：「不合格」
		if (res >= 60) {
			System.out.println("合格");
		}else {
			System.out.println("不合格");
		}
		
		//【ケース 2】
		// 80 点以上：「たいへんよくできました。」
        // 60 点以上、80 点未満：「よくできました。」
		// 60 点未満：「ざんねんでした。」
		if(res >= 80){
			System.out.println("たいへんよくできました。");
		}else if(res >= 60 && res <80) {
			System.out.println("よくできました。");
		}else {
			System.out.println("ざんねんでした。");
		}
		
		//【ケース 3】
        // 80 点以上：「優」
		// 70 点以上、80 点未満：「良」
		// 60 点以上、70 点未満：「可」
		// 60 点未満：「不可」
		if(res >=80) {
			System.out.println("優");
		}else if(res >= 70 && res <80) {
			System.out.println("良");
		}else if(res >+60 && res <70) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}
}