import java.util.ArrayList;
import java.util.List;

public class ThreeSum {
	
    public static List<List<Integer>> threeSum(int[] nums) {
    	
		int size = nums.length;
        List<List<Integer>> listOfLists = new ArrayList<>();

      List<Integer> answerList = new ArrayList<>();

    	for(int i=0 ; i<size; i++) {
			int number = 0;

			for(int j=1; j<size; j++) {
				number = nums[i] + nums[j];


					answerList.add(i);
					answerList.add(j);
					break;
				

			}
//			if(0 == number) {
//				break;
//			}

		listOfLists.add(answerList);
		return listOfLists;
    	
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
