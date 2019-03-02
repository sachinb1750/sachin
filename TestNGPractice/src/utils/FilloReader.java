package utils;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FilloReader{
	
	static Connection connection;
	static Recordset recordset;
	
	public static void main(String[] args) {
		Fillo fillo=new Fillo();
		try{
		connection=fillo.getConnection("D:\\workspace\\TestNGPractice\\resources\\Data.xlsx");
		String strQuery="Select * from TestData";
		recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
			System.out.println("UserName is : "+recordset.getField("UserName"));
			System.out.println("UserName is : "+recordset.getField("Password"));
			System.out.println("UserName is : "+recordset.getField("Name"));
		}
		}catch(Exception ex){
			System.out.println("Exception occured");
		}
	}

}
