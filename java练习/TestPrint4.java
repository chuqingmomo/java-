/*
Ԥ�����
������ߣ�cm��=������+ĸ�ף�*1.08/2
Ů����ߣ�cm��=������*0.923+ĸ�ף�/2
��֪���ף�175cm��ĸ��160cm
����Ӻ�Ů�������Ԥ�����
*/
public class TestPrint4{
	public static void main(String[] args){
		double fatherHeight=175.0;
		double motherHeight=160.0;
		double sonHeigh=(fatherHeight+motherHeight)*1.08/2;
		double daughterHeight=(fatherHeight*0.923+motherHeight)/2;
		System.out.println("���ӵ����:"+sonHeigh+"����");
		System.out.println("���ӵ����:"+daughterHeight+"����");
	}
}