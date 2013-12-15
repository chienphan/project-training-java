
public class PhuongTrinhBac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=1;
		double b=-5;
		double c=6;
		double delta=0;
		if(a!=0)
		{
			//tinh delta
			delta=b*b-4*a*c;
			if(delta>0)
			{
				// tim 2 nghiem
				double x1=0;
				double x2=0;
				double sqrtDelta = Math.sqrt(delta);
				x1=(-b-sqrtDelta)/(2*a);
				x2=(-b+sqrtDelta)/(2*a);
				System.out.println("phuong trinh co 2 nghiem x1: "+ x1 );	
				System.out.println("phuong trinh co 2 nghiem x2: "+ x2 );
			}
			else
			{
				if(delta==0)
				{
					//phuong tring 1 nghiem kep
					double x=0;
					x=-b/(2*a);
					System.out.println("phuong trinh co 1 nghiem kep x:"+ x);
				}
				else
				{
					//pt vo nghiem
					System.out.println("phuong trinh vo nghiem");
				}
			}
		}
		else
		{
			//giai phuong trinh bac 1: bx+c=0
			if(b!=0)
			{
				// phuong co nghiem
				double x=0;
				x=-b/a;
				System.out.println("Phuong trinh co nghiem x: "+x);
			}
			else
			{
				// tinh pt vo nghiem bang dk b khac 0
				if(c!=0)
				{
					System.out.println("phuong trinh vo nghiem");
				}
				else
				{
					System.out.println("phuong trinh vo so nghiem");
				}
			}
		}
			
	}

}
