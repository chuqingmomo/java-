/*
逻辑判断题
已知小红有25元，她攒了几天发现自己现有的钱比原来两倍多出10元
小蓝有30元，他攒了几天发现自己的钱正好是原来的两倍
小胖说小红和小蓝钱一样，是对的么？
*/
public class TestPrint5{
	public static void main(String[] args){
		int red=25;
		int blue=30;
		red=red*2+10;
		blue=blue*2;
		System.out.println(red==blue);
	}
	
}