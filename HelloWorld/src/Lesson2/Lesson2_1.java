package Lesson2;
import java.io.*;
class Lesson2_1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("数字を記入してください。");
		{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			
			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			if(res == 1) {
				System.out.println("1が入力されました。");
			}
			else {
				System.out.println("1以外が入力されました。");
			}
		}
	}
}

	
		
