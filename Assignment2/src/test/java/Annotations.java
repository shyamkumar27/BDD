import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {

  @Test
  public void login() {
	  System.out.println("thread value is"+Thread.currentThread().getId());
	  System.out.println("open in chrome browser");
  }
  @Test
  public void registration() {
	  System.out.println("thread value is"+Thread.currentThread().getId());
	  System.out.println("open in firefox browse");
  }
  @Test
  public void amazon() {
	  System.out.println("thread value is"+Thread.currentThread().getId());
	  System.out.println("open in ie browse");
  }
  
  @Test
  public void homepage() {
	  System.out.println("thread value is"+Thread.currentThread().getId());
	  System.out.println("open in edge browse");
  }
}
