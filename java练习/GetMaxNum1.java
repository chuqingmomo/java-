/*
�����û�����������������������ǵ����ֵ��Ϊ������
*/
//ע��import��Ҫ�İ��������֪������ʹ��*ȫ�����룬���ǲ��Ƽ�
import java.util.Scanner;

public class GetMaxNum1{
	public static void main(String[] args){
		System.out.println("�������һ��������");
		/*
		new Scanner(System.in)�Ǵӿ���̨��ȡ���ݵ���˼
		nextInt()��ʾ���Ƕ��������������
		������Ч����һ���ģ�Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		�������Ҫ���������Ƽ������ϵģ���Ϊ�����ϵ��ڴ����Ľ��٣�
		����ÿ�ζ�newһ��
		*/
		int a=new Scanner(System.in).nextInt();
		System.out.println("������ڶ���������");
		int b=new Scanner(System.in).nextInt();
		System.out.println("�����������������");
		int c=new Scanner(System.in).nextInt();
		
		/*
		�Խ��ܵ�����ֵ���бȽϣ���Ԫ�������1��2:3	
		�������ʽ�����ʽ1�����ʽ2
		�������ʽ���ʺ�ǰ�棩���ж���������ֵ��booleanֵ
		������ʽ���Ϊtrue�������ȡ���ʽ1����֮��ȡ���ʽ2��ֵ
		*/
		int max=a>b?a:b;
		max=max>c?max:c;
		//Ҳ��д�ɣ�int max=a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("���ֵ�ǣ�"+max);
	}
}