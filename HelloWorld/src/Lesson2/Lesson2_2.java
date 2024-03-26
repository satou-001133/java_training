package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 実力確認問題　2．for if文
 **/
class Lesson2_2{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("xの値を入力してください。");
		String str1  = br.readLine();
		int x = Integer.parseInt(str1);
		
		System.out.println("yの値を入力してください。");
		String str2  = br.readLine();
		int y = Integer.parseInt(str2);
		
		if(x < y) {
		if(x < y && x % 2 ==0 && y % 2  == 0) { // x は y より小さく、かつ、x と y は共に偶数である。
			System.out.println(x + "は" + y + "より小さく、かつ、" + x + "と" + y + "は共に偶数である。");
			
		}else if(x == y && x + y < 0) { //x と y は等しく、かつ、負の数である。
			System.out.println(x + "と" + y + "は等しく、かつ、負の整数である。");
			
		}else if(x < y || x % 2 == 0) { // x は y より小さい、または、x は偶数である。
			System.out.println(x + "は" + y + "より小さい。または" + x + "は偶数である。");
			
		}else if((x <= 10 || x >= 100) && (y >= 10 && y <=100)){ // x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
			System.out.println(x + "は10以下または100以上で、かつ、" + y + "は10以上かつ100以下である。");
			
		}else { // x も y も負の数である、ではない。（ x も y も負の数である、の否定）
			System.out.println(x + "も" + y + "も負の整数である。");
		}
	}
}
}