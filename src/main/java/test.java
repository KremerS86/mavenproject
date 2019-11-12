import com.google.gson.Gson;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		int[] ints = {1,2,3,4,5};
		String[] strings = {"abc", "def", "ghi"};
		
		//Serialization
		System.out.println(gson.toJson(ints));	// ==>[1,2,3,4,5]
		gson.toJson(strings); // ==>["abc", "def", "ghi"]
		
		System.setProperty("webdriver.chrome.driver", "/Users/CloseSure/Documents/Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		assertTrue(driver.getTitle().contains("Google"));
		driver.quit();
		
	}

	private static void assertTrue(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
