/*
��ָ�������������Լ������С������

���Լ����շת���������
m=24,n=30,�ô��������С����ȡ����
m%n=30%24=6
��6����n������m=24��n=6
24%6=0
����24��6�����պ���������6Ϊ���Լ���������������������ֵ�������ֱ����������

��С��������n*m/���Լ��
*/
import java.util.Scanner;
public class TestNum3{
	public static void main(String[] args){
		//ȡ�������������
		System.out.println("����������������");
		int a=new Scanner(System.in).nextInt();
		int b=new Scanner(System.in).nextInt();
		/*
		������д��
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		*/
		
		//�������Լ������
		int d=zdgys(a,b);
		//������С�������ķ���
		long x=zxgbs(a,b);
		System.out.println("���Լ����"+d);
		System.out.println("��С��������"+x);
	}
	
	/*
	 ���Լ����
                 �����������Լ������1���������н�С���Ǹ���֮��
                ��1< =���Լ�� <=min(a,b)
                ��a%��Լ��==0&&b%��Լ��==0
				��a��b���ܱ�һ��������
	*/
	private static int zdgys(int a,int b){
		//��Ԫ���ʽ�����ʽ=���ʽ���������ʽ1�����ʽ2��true�򷵻ر��ʽ1��false�򷵻ر��ʽ2
		int min=a<b?a:b;
		for(int i=min;i>=1;i--){
			//i�ܰ�a��bͬʱ����
			if(a%i==0 && b%i==0){
				return i;
			}
		}
		//��δ��벻�ᱻִ�У�ֻ��Ϊ���ñ���ͨ��
		return 0;
	}
	
	/*
	 ��С��������
                ����������С�����������������нϴ�������������ĳ˻�֮��
                ��max��a,b��<=��С������<=a*b
                �ҹ�����%a==0&&������%b==0
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