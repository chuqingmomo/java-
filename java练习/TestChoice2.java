/*
最优选择2
小蓝想买价值8888元的新手机，旧手机能卖出去1880元
手机专卖店推出以旧换新优惠，新手机优惠能打7.5折
为了更省钱，要不要以旧换新
*/
public class TestChoice2{
	public static void main(String[] args){
		int plan1=8888-1880;
		double plan2=8888*0.75;
		if(plan1>plan2){
			System.out.println("卖掉旧手机更省钱");
		}else{
			System.out.println("以旧换新更便宜");
		}
	}
}