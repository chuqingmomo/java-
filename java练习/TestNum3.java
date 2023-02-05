/*
求指定两个数的最大公约数和最小公倍数

最大公约数（辗转相除法）：
m=24,n=30,用大的数除于小的数取余数
m%n=30%24=6
将6赋给n，则有m=24，n=6
24%6=0
再用24除6，若刚好能整除则6为最大公约数，若不能整除则继续赋值求余计算直到可以整除

最小公倍数：n*m/最大公约数
*/
import java.util.Scanner;
public class TestNum3{
	public static void main(String[] args){
		//取输入的两个整数
		System.out.println("请输入两个整数：");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		/*
		或这样写：
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		*/
		
		//调用最大公约数方法
		int d=zdgys(a,b);
		//调用最小公倍数的方法
		long x=zxgbs(a,b);
		System.out.println("最大公约数："+d);
		System.out.println("最小公倍数："+x);
	}
	
	/*
	 最大公约数：
                 两个数的最大公约数介于1和两个数中较小的那个数之间
                即1< =最大公约数 <=min(a,b)
                且a%公约数==0&&b%公约数==0
				即a和b都能被一个数整除
	*/
	private static int zdgys(int a,int b){
		//三元表达式：表达式=表达式条件？表达式1：表达式2，true则返回表达式1，false则返回表达式2
		int min=a<b?a:b;
		for(int i=min;i>=1;i--){
			//i能把a和b同时整除
			if(a%i==0 && b%i==0){
				return i;
			}
		}
		//这段代码不会被执行，只是为了让编译通过
		return 0;
	}
	
	/*
	 最小公倍数：
                两个数的最小公倍数介于两个数中较大的数和两个数的乘积之间
                即max（a,b）<=最小公倍数<=a*b
                且公倍数%a==0&&公倍数%b==0
	*/
	private static long zxgbs(int a,int b){
		int max=a>b?a:b;
		for(long i=max;;i+=max){
			if(i%a==0 && i%b==0){
				return i;
			}
		}
		
	}
}