/*
�ж������������������ż��
*/
import java.util.Scanner;
public class TestNum1{
	public static void main(String[] args){
		//�õ�һ���������
		System.out.println("������һ����");
		int input=new Scanner(System.in).nextInt();
		if(input%2==0){
			System.out.println(input+"�������ż��");
		}else{
			System.out.println(input+"�����������");
		}
	}
}