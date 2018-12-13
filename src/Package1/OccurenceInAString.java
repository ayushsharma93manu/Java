package Package1;

public class OccurenceInAString {
	
	public static void main(String[] args) {
		
		String str="hee";
		int counter=0;
		
		for(char c='a';c<='z';c++)
		{
			for(int i=0;i<str.length();i++)
			{
				if(c==str.charAt(i))
				{
					counter++;
				}
			
			}
			if(counter>0)
			{
				System.out.println(c+":"+counter);
			}
		}
			
			
		
			
			
	}
}

	
