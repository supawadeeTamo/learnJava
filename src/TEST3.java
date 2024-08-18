import java.util.Arrays;

public class TEST3 {

	public static int largestPairSum(int[] numbers){
		
		int count = numbers.length;
		Arrays.sort(numbers);
			
		System.out.print(numbers[count-1]+numbers[count-2]);
		return numbers[count-1]+numbers[count-2];
    }
	
	public static void main(String[] args) {
		largestPairSum(new int[] {1, 2, 3, 4, 6, -1, 2});
	}

}
