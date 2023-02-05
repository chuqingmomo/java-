/*
求数字的绝对值
绝对值是指一个数在数轴上所对应点到原点的距离，用“||”表示。
负数的绝对值是他去掉负号以后的值，而非负数（0和正数）的绝对值是他本身
请定义一个方法，接收用户输入的数字，输出绝对值的结果
*/
import java.util.Scanner;
public class TestNum2{
	public static void main(String[] args){
		//拿到输入的数
		System.out.println("请输入一个数");
		double input=new Scanner(System.in).nextDouble();
		//调用求绝对值的方法并拿到方法后执行的结果（返回值）
		double result=getAbsNum(input);
		//打印求出的结果
		System.out.println(input+"的绝对值是："+result);
	}
	private static double getAbsNum(double input){
		if(input>=0){//非负则返回本身的值
			return input;
		}else{//负数则返回值的取反
			return -input;
		}
	}
}