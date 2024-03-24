package Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Lesson2_1{
	public static void main(String[] args)throws IOException{
		System.out.print("成績を入力してください。");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		 switch(res) {
		 case 1:
		 System.out.println("もっとがんばりましょう");
		 break;
		 case 2:
	     System.out.println("もう少しがんばりましょう");
		 break;
		 case 3:
	     System.out.println("さらに上を目指しましょう");
		 break;
		 case 4:
		 System.out.println("大変よくできました");
		 break;
		 case 5:
	     System.out.println("大変優秀です");
		 break;
		 default :
		 System.out.println("正確な数字を入力してください");
		 }
	}
}