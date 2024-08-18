import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringIncrementer {
	
	public static String incrementString(String str) {
		
		  Pattern pattern = Pattern.compile("[0-9,]+|[a-zA-Z]+ *[a-zA-Z]*");
		  int intValue = 0;
		  int getLength = 0;
		  int valueGetNum = 0;
		  String connectString = "";
		  ArrayList<String> result = new ArrayList<String>();
		  Matcher m = pattern.matcher(str);
		  if(str == "") {
			  intValue = intValue+1;
			  connectString = String.valueOf(intValue);
		  }else {
			  while (m.find()) {
			         System.out.println(">"+m.group(0)+"<");  
			         result.add(m.group(0));
			   }
			 
			  if(result.size() > 1) {
				  valueGetNum = Integer.parseInt(result.get(1));
				  intValue = valueGetNum + 1;
				  getLength = result.get(1).length();
				  connectString = result.get(0) + String.format("%0"+getLength+"d", intValue);

			  }else {
				  intValue = intValue+1;
				  connectString = result.get(0) + intValue;
			  }
		  }
		
		  
	      System.out.print(connectString);
	      return connectString; 
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		incrementString("40097387637628902592534635520214");
		
//	  รับค่าเป็น null ก็ต้อง return 1		
//			foobar000 --> foobar001
//			foobar001 --> foobar002
//			foobar99 --> foobar100
//			foobar099 --> foobar100
//			input: <40097387637628902592534635520214> ==> expected: <40097387637628902592534635520215> but was: <400973876376289025925346355202141>
//	
//			foobar000 --> foobar001
//			foobar999 --> foobar1000
//			foo --> foo1
//			foobar00999 --> foobar01000
//			foobar001 --> foobar002
//			foobar1 --> foobar2
//			"" --> 1
	}

}
