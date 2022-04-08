package Labs;


import org.testng.annotations.DataProvider;

public class Exp6 {


  @DataProvider(name="dataprovider1")
  public static Object[][] login() {
	  Object data[][] = new Object[3][2];
	  data[0][0]="Kartikeya532001@gmail.com";
	  data[0][1]="Khanna5301";
	  data[1][0]="Kartikeya532001@gmail.com";
	  data[1][1]="Khanna5301";
	  data[2][0]="Kartikeya532001@gmail.com";
	  data[2][1]="Khanna5301";
	  return data;
    
  }
}
