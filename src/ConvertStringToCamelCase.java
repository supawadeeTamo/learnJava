
import java.util.ArrayList;
import java.util.List;

public class ConvertStringToCamelCase {

	public static String ConvertValueToCamel(String words) {

		String[] dataSplit = new String[100];
		if(words.contains("-")) {
		     dataSplit = words.split("-");
		}else {
			 dataSplit = words.split("_");
		}

		String c = null;
		
		StringBuilder sb = new StringBuilder();

        String replaceString = "";

		for (int i = 0; i < dataSplit.length; i++) {
			if(i == 0) {
				sb.append(dataSplit[i]) ;
			}
			if (i > 0) {
				c = Character.toString(dataSplit[i].charAt(0)).toUpperCase();
					replaceString = dataSplit[i].toLowerCase().replaceFirst(c.toLowerCase(),c);
				//	System.out.println(replaceString);
					sb.append(replaceString);
			}
		
		}

		System.out.print(sb.toString());
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConvertValueToCamel("t_Rockstar_Rockstar_Wall_down_river");

	}

}
