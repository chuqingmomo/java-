/*
接收用户输入的三个整数，并将它们的最大值作为结果输出
*/
//注意import需要的包，如果不知道可以使用*全部导入，但是不推荐
import java.util.Scanner;

public class GetMaxNum1{
	public static void main(String[] args){
		System.out.println("请输入第一个整数：");
		/*
		new Scanner(System.in)是从控制台读取数据的意思
		nextInt()表示的是读入的数据是整数
		与这条效果是一样的：Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		但是如果要输入多个数推荐用以上的，因为用以上的内存消耗较少，
		不用每次都new一个
		*/
		int a=new Scanner(System.in).nextInt();
		System.out.println("请输入第二个整数：");
		int b=new Scanner(System.in).nextInt();
		System.out.println("请输入第三个整数：");
		int c=new Scanner(System.in).nextInt();
		
		/*
		对接受的三个值进行比较，三元运算符：1？2:3	
		条件表达式？表达式1：表达式2
		条件表达式（问号前面）是判断条件返回值是boolean值
		如果表达式结果为true，结果就取表达式1，反之就取表达式2的值
		*/
		int max=a>b?a:b;
		max=max>c?max:c;
		//也可写成：int max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("最大值是："+max);
	}
}