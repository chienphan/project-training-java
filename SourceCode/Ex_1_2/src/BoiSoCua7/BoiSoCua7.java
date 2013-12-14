package BoiSoCua7;

public class BoiSoCua7 {
	public static void main(String[] args){
		int i;
		int dem = 0;
		System.out.print("gom cac so: ");
		for(i=1;i<=100;i++)
		{
			if(i%7==0)
			{
				dem=dem+1;
				//System.out.print("gom cac so:");
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\nboi so cua 7 tu 0 den 100: " +dem);
	}
}