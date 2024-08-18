import java.util.ArrayList;
import java.util.HashSet;

public class TEST4 {

	public static String removeConsecutiveDuplicates(String s) {

		String[] splitText = s.split(" ");

		ArrayList<String> value = new ArrayList<String>();
		int count = 0;
		int flage = 0;
		for (int i = 0; i < splitText.length; i++) {
		
			if(count == 0) {
				value.add(splitText[i]);
				count++;
			}
	
			 if(count > 0) {
				for (int j = 0; j <value.size(); j++) {
				
					if (value.get(j) != splitText[i]) {
						// value.add(splitText[i]);

						//System.out.println(value.get(j) + "1");
						//System.out.println(splitText[i]);
						// System.out.print(value.get(flage) + " ");
						// flage++;
					}
				}
			}
			
		}

		// System.out.println(value.get(flage));
		 //System.out.println(count);
		// for(int j = 0; j<value.size(); j++) {
		// System.out.print(value.get(j) + " ");
		// }

		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeConsecutiveDuplicates("alpha beta beta gamma");
	}

}
