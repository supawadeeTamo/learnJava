
public class TEST2 {
	
		public static int[] doubleEveryOther(int[] a){
			for(int i=0; i<a.length; i++) {
				if(i%2 == 1) {
					a[i] =  a[i]+a[i];
				}
				//save value tod
				System.out.print(a[i]);
			}
		    return a;
		}
		
	public static void main(String[] args) {
		doubleEveryOther(new int[] {1,2,3,4});
	}

}
