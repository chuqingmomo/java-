/*
����������㣺
������ȡ���ڴ���ҵ�񣬴���Ϊһ�꣬���꣬���꣬���꣬����ƾ�浥֧ȡ��Ϣ��
��������ʱ����£�
һ�꣺2.25
���꣺2.7
���꣺3.25
���꣺3.6
�����һ����1000��棩����һ�����ޣ���ѡһ�����㵽�ں�ı�Ϣ�ܶ�
����������޾��ɼ���¼��
��Ϣ���㷽ʽ������+����*������*����
*/
import java.util.Scanner;
public class BankDemo1{
	public static void main(String[] args){
		//��ʾ������õ�����
		System.out.println("�����뱾��");
		int money=new Scanner(System.in).nextInt();
		System.out.println("����洢���ޣ�");
		int year=new Scanner(System.in).nextInt();
		//��������������汾�����Ϣ֮��
		double outMoney=0;
		//�������ʺ����޼��㱾Ϣ֮��
		if(year==1){
			outMoney=money+money*2.25/100*1;
		}else if(year==2){
			outMoney=money+money*2.7/100*2;
		}else if(year==3){
			outMoney=money+money*3.25/100*3;
		}else if(year==5){
			outMoney=money+money*3.6/100*5;
		}else{
			System.out.println("�������������");
		}
		System.out.println("���"+year+"���ı�Ϣ��"+outMoney);
		
	}
}