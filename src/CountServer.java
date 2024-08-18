import java.util.ArrayList;
import java.util.List;

public class CountServer {

	private static ArrayList<String> countText(int n, ArrayList<String> valueOfServer){
		
		int indexServer = 1;
		int errorServer = 0;
        int[] arr = new int[1000]; 
		ArrayList<String> result = new ArrayList<String>();
		
		for(String value : valueOfServer) {
			for(int i=0; i<=n; i++) {
				if(value.contains(String.valueOf(i))){
					if(value.contains("error")){
//						errorServer++;
						arr[i]++;
						System.out.println(arr[i] + "arr "+ "vale i = " + i );
					}
					
//					System.out.println(errorServer);

					if(arr[i] == 4) {
						result.add("400");
					}else {
						result.add("200");
					}
				}
			
			}
		
		}
		System.out.print(result);

		return valueOfServer;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> serverList = new ArrayList<String>();
		serverList.add("sever 1 success"); //--> 200
		serverList.add("sever 1 error"); //--> 200
		serverList.add("sever 2 success"); //--> 200
		serverList.add("sever 2 success"); //-->200
		serverList.add("sever 1 error");//-->200
		serverList.add("sever 1 error"); //-->200
		serverList.add("sever 1 error"); //-->400
		serverList.add("sever 1 success");//-->200
		serverList.add("sever 2 error");//-->200
		serverList.add("sever 1 error"); //-->200
		countText(2, serverList);
//		System.out.print(countText(2, serverList));
		
	}

}
