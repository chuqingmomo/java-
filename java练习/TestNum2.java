/*
�����ֵľ���ֵ
����ֵ��ָһ����������������Ӧ�㵽ԭ��ľ��룬�á�||����ʾ��
�����ľ���ֵ����ȥ�������Ժ��ֵ�����Ǹ�����0���������ľ���ֵ��������
�붨��һ�������������û���������֣��������ֵ�Ľ��
*/
import java.util.Scanner;
public class TestNum2{
	public static void main(String[] args){
		//�õ��������
		System.out.println("������һ����");
		double input=new Scanner(System.in).nextDouble();
		//���������ֵ�ķ������õ�������ִ�еĽ��������ֵ��
		double result=getAbsNum(input);
		//��ӡ����Ľ��
		System.out.println(input+"�ľ���ֵ�ǣ�"+result);
	}
	private static double getAbsNum(double input){
		if(input>=0){//�Ǹ��򷵻ر����ֵ
			return input;
		}else{//�����򷵻�ֵ��ȡ��
			return -input;
		}
	}
}