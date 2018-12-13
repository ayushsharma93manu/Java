package Package1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseAnArray {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int n = scan.nextInt();
		int firstIndex=0, lastindex=n-1,temp=0;
		int[]arr=new int[n];
		System.out.println("Enter values");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n/2;i++)
		{
			temp=arr[firstIndex];
			arr[firstIndex]=arr[lastindex];
			arr[lastindex]=temp;
			firstIndex++;lastindex--;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
