package seleniumTesting;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
class TestJUnitSelenium {

	public WebDriver driver;

	@BeforeEach
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver", "apps/chromedriver.exe");
		driver = new ChromeDriver();
	}


	@Test
	@DisplayName("Verificar o título da página")
	public void testTitulo() {
		driver.get("https://google.com/");
		String title = driver.getTitle();
		assertTrue(title.compareTo("Google") == 0, "Título não corresponde");
	}

	@Test
	@DisplayName("Pesquisar palavra Cesar School")
	public void testPesquisa() {
		driver.get("https://google.com/");
		WebElement search = driver.findElement(By.name("q"));

		search.sendKeys("Cesar School");

		search.submit();
		WebDriverWait w = new WebDriverWait(driver, 5);
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul")));

		WebElement bodyTag = driver.findElement(By.tagName("body"));

		assertTrue(bodyTag.getText().contains("CESAR School: Início"), "Página não encontrada");
	}
	
	@AfterEach
	public void TearDownTest() {
		driver.close();
	}
}
