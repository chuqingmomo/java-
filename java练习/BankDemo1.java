/*
银行收入计算：
整存整取定期储蓄业务，存期为一年，两年，三年，五年，到期凭存单支取本息。
存款年利率表如下：
一年：2.25
两年：2.7
三年：3.25
五年：3.6
请存入一定金额（1000起存），存一定年限，四选一，计算到期后的本息总额
存入金额和年限均由键盘录入
本息计算方式：本金+本金*年利率*年限
*/
import java.util.Scanner;
public class BankDemo1{
	public static void main(String[] args){
		//提示输入和拿到输入
		System.out.println("请输入本金：");
		int money=new Scanner(System.in).nextInt();
		System.out.println("输入存储年限：");
		int year=new Scanner(System.in).nextInt();
		//定义变量用来保存本金和利息之和
		double outMoney=0;
		//根据利率和年限计算本息之和
		if(year==1){
			outMoney=money+money*2.25/100*1;
		}else if(year==2){
			outMoney=money+money*2.7/100*2;
		}else if(year==3){
			outMoney=money+money*3.25/100*3;
		}else if(year==5){
			outMoney=money+money*3.6/100*5;
		}else{
			System.out.println("输入的年限有误");
		}
		System.out.println("存款"+year+"年后的本息是"+outMoney);
		
	}
}