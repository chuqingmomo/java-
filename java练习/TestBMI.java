/*
BMIָ������BMI=���أ�kg��/���*��ߣ�m��
���᣺����18.5
������18.5~22.9
ƫ�֣�23~24.9
���֣�25~29.9
�ضȷ��֣�����30
���ȷ��֣�����40
*/
import java.util.Scanner;
public class TestBMI{
	public static void main(String[] args){
		//�õ��������ֵ
		System.out.println("���������");
		Double height=new Scanner(System.in).nextDouble();
		System.out.println("����������");
		Double weight=new Scanner(System.in).nextDouble();
		
		//����getBMI����������������ߺ�������Ϣ������
		getBMI(height,weight);
		
	}
	public static void getBMI(double h,double w){
		//���BMIָ��
		double bmi=w/(h*h);
		//����һ������r���������ս��
		String r="";
		//����bmiָ����Χ����r���¸�ֵ
		if(bmi<18.5){
			r="����";
		}else if(bmi<=22.9){
			r="����";
		}else if(bmi<=24.9){
			r="ƫ��";
		}else if(bmi<=29.9){
			r="����";
		}else if(bmi<=40){
			r="�ضȷ���";
		}else{
			r="���ȷ���";
		}
		System.out.println("���BMIָ��Ϊ��"+bmi);
		System.out.println("����������ڣ�"+r);
	}
	
}