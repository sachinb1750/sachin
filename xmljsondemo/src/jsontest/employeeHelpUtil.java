package jsontest;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class employeeHelpUtil {
	private static ObjectMapper mapperObj;
	static {
		mapperObj=new ObjectMapper();
	}
	public static String convertJavaToJson(Object object) {
		String jsonResult="";
		try {
			jsonResult = mapperObj.writeValueAsString(object);
		}catch(JsonGenerationException jge) {
			System.out.println("Exception while converting Java Object into Json : Generation");
		}catch(JsonMappingException jme) {
			System.out.println("Exception while converting Java Object into Json : Mapping");
		}
		catch (IOException e) {
			System.out.println("Exception Occured");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonResult;
		
	}
	public static <T>T convertJsonToJava(String jsonString,Class<T> cls) {
		T result=null;
		try {
			result=mapperObj.readValue(jsonString,cls);
		}catch(JsonParseException jpe) {
			System.out.println("Exception while converting Json into Java");
		}catch(JsonMappingException jme) {
			System.out.println("Exception while converting Json into Java");
		}		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
}
