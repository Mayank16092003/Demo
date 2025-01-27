public class Prime{
	public static void main(String[] args){
	int fac=0;
	int k=2;
	for(int i=2;i<=10;i++){
		for(int j=2;j<=i/2;j++)
		{
			if(i%k==0)
				fac++;
		if(fac==1)
			System.out.println(i);
		}
		
	}		
}}
