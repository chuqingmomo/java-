/*
输入数字1~7，输出对应星期几
*/
import java.util.Scanner;
public class TestDay{
	public static void main(String[] args){
		//拿到输入的数
		System.out.println("请输入一个数");
		int input=new Scanner(System.in).nextInt();
		if(input==1){
			System.out.println("星期一");
		}else if(input==2){
			System.out.println("星期二");
		}else if(input==3){
			System.out.println("星期三");
		}else if(input==4){
			System.out.println("星期四");
		}else if(input==5){
			System.out.println("星期五");
		}else if(input==6){
			System.out.println("星期六");
		}else if(input==7){
			System.out.println("星期天");
		}else{
			System.out.println("什么都不是");
		}
	}
}