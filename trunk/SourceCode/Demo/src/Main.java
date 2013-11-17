
public class Main {

	public static void main(String[] args) {
	
		byte nByte = 127;
		//++ nByte;
		//nByte ++;
		// nByte = nByte + 1;
		//System.out.println(nByte ++);
		nByte += 2;
		//nByte = nByte + 2
		
//		for(int i = 1; i <= 10; i++ ){
//			System.out.println("xin" + " chao " + i);
//		}
		
		int i = 11;
		while(i <= 10)
		{
			System.out.println("xin" + " chao 1 " + i);
			i++;
			//break;
		}
		
		i = 11;
		do
		{
			System.out.println("xin" + " chao 2 " + i);
			i++;
			//continue;
		}
		while(i <= 10);
		
		
//		if('B' > 'A')
//		{
//			System.out.println(" B > A ");
//		}
	}

}
