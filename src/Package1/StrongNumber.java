package Package1;

	public class StrongNumber {
		static int fact(int n) {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		}
		static boolean Strong(int n) {
			int sum=0;
			int copy=n;
			while(n!=0) {
				int rem=n%10;
				sum=sum+fact(rem);
				n=n/10;
			}
			if(copy==sum) {
				return true;
			}
			return false;
		}
		public static void main(String[] args){ 
			System.out.println(Strong(146));
		}
	}


