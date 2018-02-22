package fristproject1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class logidatap {
  @Test(dataProvider = "Testdp")
  public void data(String un, String pw, String message) {
	  System.out.println(un,pw,message);
  }

  @DataProvider
  public Object[][] Testdp() {
    return new Object[][] {
      new Object[] { "", "","invalid email and pass" },
      new Object[] { "tft", "12345","wrong email and pass" },
      new Object[] { "kiran@gmail.com", "123456","admin-dashbord" },
      
      
    };
  }
}
