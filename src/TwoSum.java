import java.util.ArrayList;

public class TwoSum {

	   public static int[] twoSum(int[] nums, int target) {
	    
		int size = nums.length;
        ArrayList<Integer> answerList = new ArrayList<>();

		
		for(int i=0 ; i<size; i++) {
			int number = 0;

			for(int j=1; j<size; j++) {
				number = nums[i] + nums[j];
//				System.out.print(number);

				if(i == j) {
				continue;
				}
				if(target == number) {
					
					answerList.add(i);
					answerList.add(j);
					break;
				}

			}
			if(target == number) {
				break;
			}


		}

		
		   int[] intArray = answerList.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();

			
			System.out.print(answerList);
		   
		return intArray;



	}

	public static void main(String[] args) {

	 int[] num = new int[] {2,7,11,15}; 
	 int target = 9;
     int[] result = twoSum(num, target);



	}
}
