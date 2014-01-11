
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = new int[10];
		//System.out.println("in a :  " + a[1]);
		int mang[]={1435,23453,3453,344,535,65,7345,358,3459,4550,2834,1,0,5,0,1};
		//String b[]={"thang mot","thang hai","thang ba","thang tu","thang nam","thang sau","thang bay","thang tam","thang chin","thang muoi","thang muoi mot","thang muoi hai"};
		//sap xep mang theo gia tri tang dan..!!!
		for(int i = 0; i < mang.length-1; i++)
		{
			for(int index= 0; index < mang.length-1; index++)
			{
				if(mang[index]>mang[index+1])
				{
					int tam=mang[index];
						mang[index]=mang[index+1];
						mang[index+1]=tam;
				}
			}
		}
		// sap xep mang theo gia tri giam dan...!!!
		for(int index=0 ; index <mang.length; index++)
		{
			System.out.println("in mang theo gai tri tang dan: " +mang[index]);
		}
			
		for(int index=mang.length-1 ; index>=0; index-- )
		{
			System.out.println("in mang theo gai tri giam dan: "+mang[index]);
		}
	}

}
