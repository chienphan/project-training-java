
public class HePhuongTrinh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3;
		double a1=5;
		double b=5;
		double b1=2;
		double c=5;
		double c1=6;
		double Dx=0;
		double Dy=0;
		double D=0;
		D=a*b1-b*a1;
		Dx=a*b1-c1*b;
		Dy=a*c1-a1*c;
		if(D!=0)
		{
			double x;
			double y;
			x=Dx/D;
			y=Dy/D;
			System.out.println("he phuong trinh co nghiem x =" +x);
			System.out.println("he phuong trinh co nghiem y =" +y);		
		}
		else
		{
			if((Dx==0)&&(Dy==0))
			{
				System.out.println("he phuong trinh vo so nghiem");
			}
			else
			{
				System.out.println("he phuong trinh vo nghiem ");
			}
		}
	}

}
