package Wrapper;

import java.util.HashMap;

public class GlobalSetup {

	public static String dir = System.getProperty("user.dir");
	
	public static String xfilePath=dir+ "/src/test/resources/testdata/LINKS.xls";
	
	public static HashMap<String, String > errorMsg=new HashMap<String, String>();
	public static HashMap<String, String > errorCodeXPATH=new HashMap<String, String>();

	static{
		String error[][]=UtilWrapper.getTableArray(GlobalSetup.xfilePath, "common", "errorcode");
		for (String[] strings : error) {
			System.out.println(strings.length + "********************* "+strings[0]+  "  "+ strings[1]);
			
			errorMsg.put(strings[0], strings[1]);
			errorCodeXPATH.put(strings[0], strings[2]);
			
		}
	}
	
	GlobalSetup(){
		
	}
	
	
}
