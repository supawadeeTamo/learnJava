import java.util.ArrayList;
import java.util.Scanner;

public class TestMax {

	

	
	public static void main(String[] args) {
	
//		System.out.print("Input is number " );
//		Scanner keyboard = new Scanner(System.in);
//		int n = keyboard.nextInt();
//		int x = 0;
//		int max = 0;
//		ArrayList<Integer> arrList = new ArrayList<Integer>();
//		
//		for(int i=0; i<n; i++) {
//			x = keyboard.nextInt();
//			arrList.add(x);
//		}
//		
//		for(int j=0; j<arrList.size(); j++) {
//			if( arrList.get(j) > max ) {
//				max = arrList.get(j);
//			}
//		}	
//		System.out.println("value max is "+ max);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("number value ");
		String n = keyboard.next();
		int convertNum = Integer.parseInt(n);
		int max = 0;
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int count = 0;

		while(count < convertNum) {
			String x = keyboard.next();
			int convertX = Integer.parseInt(x);
			arrList.add(convertX);
			
			if(arrList.get(count) > max) {
				max = arrList.get(count);
			}
			count++;
		}
		
		System.out.println("value max is "+ max);
		
	}
}
