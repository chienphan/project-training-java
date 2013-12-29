
public class BoiSoChungNhonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double m=3;
		double n=7;
		double tich;
		double bscnn;
		tich=m*n;
		while(m!=n)
		{
			if(m>n)
			{
				m=m-n;
			}
			else
			{
				n=n-m;
			}		
		}
		System.out.println("uoc so chung lon nhat cua m va n la :" +m);
		bscnn=tich/m;
		System.out.println("boi so chung nho nhat cua m va n la :"+bscnn);
	}

}
