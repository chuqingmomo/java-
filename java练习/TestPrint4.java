/*
预测身高
儿子身高（cm）=（父亲+母亲）*1.08/2
女儿身高（cm）=（父亲*0.923+母亲）/2
已知父亲：175cm，母亲160cm
则儿子和女儿的身高预测多少
*/
public class TestPrint4{
	public static void main(String[] args){
		double fatherHeight=175.0;
		double motherHeight=160.0;
		double sonHeigh=(fatherHeight+motherHeight)*1.08/2;
		double daughterHeight=(fatherHeight*0.923+motherHeight)/2;
		System.out.println("儿子的身高:"+sonHeigh+"厘米");
		System.out.println("儿子的身高:"+daughterHeight+"厘米");
	}
}