package listeners;

import junit.framework.Assert;
import org.testng.annotations.*;

@Listeners(CustomListeners.class)
public class ScreenShotTest extends BaseClass {
	
	@BeforeMethod
	public void setUP() {
		Initialization();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
	@Test
	public void screenShotMethod() {
		
		Assert.assertEquals(true, false);
	}
	@Test
	public void LoginTest() {
		
		Assert.assertEquals(true, false);
	}
	@Test
	public void RegistrationTest() {
		
		Assert.assertEquals(true, false);
	}
	@Test
	public void HomePageTest() {
		
		Assert.assertEquals(true, false);
	}

}
