package Package1;

public class ArmStrongNumber {
	
	
	public static int count(int num)
	{
		int count=0;
		while(num!=0)
		{
			int last = num%10;
//			System.out.println(last);
			count++;
			num=num/10;
		} 
		return count;
	}
	
	static int  power(int digit,int power)
	{
		int pow=1;
		for(int i=1;i<=power;i++)
		{
			pow=pow*digit;
		}
		return pow;
	}
	public static void main(String[] args) {
		
		int num=371;
		int sum=0;
		int copy=num;
		int c = count(num);
		
		while(num!=0)
		{
			int last = num%10;
			System.out.println(last);
			sum=sum+ power(last, c);
			num=num/10;
		}
		if(sum==copy)
		{
			System.out.println(":Number is armstrong");
		}
		else
		{
			System.out.println("Number is not armstrong");
		}
		
		
		
	}

}

