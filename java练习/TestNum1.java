/*
判断输入的数是奇数还是偶数
*/
import java.util.Scanner;
public class TestNum1{
	public static void main(String[] args){
		//拿到一个输入的数
		System.out.println("请输入一个数");
		int input=new Scanner(System.in).nextInt();
		if(input%2==0){
			System.out.println(input+"这个数是偶数");
		}else{
			System.out.println(input+"这个数是奇数");
		}
	}
}