/*
最优选择1
外卖商家优惠如下：
鱼香肉丝单点24，油炸花生单点8，米饭单点3
订单满30八折
鱼香肉丝优惠16，但是优惠和折扣不能同时使用
要点这三样，最少花多少钱
*/
public class TestChoice16{
	public static void main(String[] args){
		double money1=24+8+3;
		System.out.println(money1);
		money1=(money1<=30?money1:money1*8);
		double money2=16+8+3;
		System.out.println(money2);
		double money=money1<money2?money1:money2;
		System.out.println(money);
		
	}
}