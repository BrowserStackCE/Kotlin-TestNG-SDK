package testCases

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert.assertTrue
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class SeleniumKotlinTestLocal {

    private lateinit var driver: WebDriver

    @BeforeMethod(alwaysRun = true)
    fun setUp() {
        val options = ChromeOptions()
        options.addArguments("start-maximized")
        driver = ChromeDriver(options)
    }

   @Test 
   fun sampleTest() {
        driver.get("http://bs-local.com:45454/")
        assertTrue(driver.title.contains("BrowserStack Local"))
    }

    @AfterMethod
    fun tearDown() {
        driver.quit()
    }
}
