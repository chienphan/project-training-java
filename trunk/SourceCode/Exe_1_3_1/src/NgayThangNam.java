
public class NgayThangNam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thang=2;
		int nam=2004;
		switch(thang){
			case 1: System.out.println("Thang mot"); break;
			case 2: System.out.println("Thang hai");
				if((nam%4==0)&&(nam%100!=0)){
					System.out.println("thang co 29 ngay");
				}
				else
				{
					System.out.println("thang co 28 ngay");
				}
				break;
			case 3: System.out.println("Thang ba");break;
			case 4: System.out.println("Thang tu");break;
			case 5: System.out.println("Thang nam");break;
			case 6: System.out.println("Thang sau");break;
			case 7: System.out.println("Thang bay");break;
			case 8: System.out.println("Thang tam");break;
			case 9: System.out.println("Thang chin");break;
			case 10: System.out.println("Thang muoi");break;
			case 11: System.out.println("Thang muoi mot");break;
			case 12: System.out.println("Thang muoi hai");	break;
			default: System.out.println("thang khong hop le");
		}
		
	//	String[] listOfmonth = {"Thang gieng","Thang hai","Thang ba","Thang tu","Thang nam","Thang sau",
	//			"Thang bay","Thang tam","Thang chin","Thang muoi","Thang muoi mot","Thang muoi hai"};
	//	 System.out.println(listOfmonth[thang - 1]);
	
//		if(thang==1)
//		{
//			System.out.println("Thang mot");
//			System.out.print("co 31 ngay");
//		}
//		if(thang==2)
//		{
//			System.out.print("thang hai ");
//			if((nam%4==0)&&(nam%100!=0))
//			{
//				System.out.print("co 29 ngay");
//			}
//			else
//			{
//				System.out.print("co 28 ngay");
//			}
//			
//		}
//		if(thang==3)
//		{
//			System.out.println("thang ba");
//		}
//		if(thang==4)
//		{
//			System.out.println("thang tu");
//		}
//		if(thang==5)
//		{
//			System.out.println("thang nam");
//		}
//		if(thang==6)
//		{
//			System.out.println("thang sau");
//		}
//		if(thang==7)
//		{
//			System.out.println("thang bay");
//		}
//		if(thang==8)
//		{
//			System.out.println("thang tam");
//		}
//		if(thang==9)
//		{
//			System.out.println("thang chin");
//		}
//		if(thang==10)
//		{
//			System.out.println("thang muoi");
//		}
//		if(thang==11)
//		{
//			System.out.println("thang muoi mot");
//		}
//		if(thang==12)
//		{
//			System.out.println("thang muoi hai");
//		}
		
	}

}
