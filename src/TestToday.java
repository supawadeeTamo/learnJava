
public class TestToday {
	
	public static String SumValue(String s) {
		String[] splitText = s.split("");
		int count = 0;
		
		for(int i=0 ; i<splitText.length; i++) {
			//System.out.println(splitText[i]);
			
			for(int j=1; j<splitText.length; j++) {
				if(splitText[i].equals(splitText[j])) {
					count++;
				}
				
			}
			System.out.println(count);
		}
		
		

		
		return "";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: aaaabbcdd
		//output: 4a2b1c2d
		SumValue("aaaabbcdd"); //bcdd
		
	}

}
