/*
����ѡ��1
�����̼��Ż����£�
������˿����24����ը��������8���׷�����3
������30����
������˿�Ż�16�������Żݺ��ۿ۲���ͬʱʹ��
Ҫ�������������ٻ�����Ǯ
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