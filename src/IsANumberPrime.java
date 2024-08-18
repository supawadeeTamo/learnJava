
public class IsANumberPrime {
	
	public static boolean isPrime(int num) {
		
		if(num < 2) {
			return false;
		}
		else{
			
			int countNumber = 0;
			double number = num;
//			if(num > 100) {
//				number = Math.sqrt(num);
//			}
			
			for(int i=2; i<= Math.sqrt(num) ; i++) {
				
				int n = num%i;
				if(n == 0) {
					return false;

//					countNumber++;
				}
//			      System.out.println(n);
			}
			
//			if(countNumber > 0) {
//				return false;
//			}else {
//				return true;
//			}
			return true;

		}
		
		
	}
	

	public static void main(String[] args) {
//	      System.out.print(isPrime(545275358));
//	      System.out.print(isPrime(152144353));
	      System.out.print(isPrime(5099));
	      System.out.print(isPrime(137288089));
	      System.out.print(isPrime(7));

	}

}
