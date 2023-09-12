package TestNGAnnotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {

	@Test(dataProvider =  "getdata")
	public void login(String username,String password) {
		
		System.out.println(username + ""+password);
	}
	@DataProvider(name = "getdata")
	
	public Object[][] data() {
		Object[][]data=new Object[3][2];
		data[0][0]="username 1";
		data[0][1]="pass1";
		data[1][0]="username2";
		data[1][1]="password2";
		data[2][0]="username3";
		data[2][1]="password3";
		
		return data;
	}
	
}
