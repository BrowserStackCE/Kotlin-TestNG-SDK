package testCases

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod
import org.testng.annotations.Test

class SeleniumKotlinTest {

    private lateinit var driver: WebDriver

    @BeforeMethod(alwaysRun = true)
    fun setUp() {
        val options = ChromeOptions()
        options.addArguments("start-maximized")
        driver = ChromeDriver(options)
    }

    @Test
    fun sampleTest() {
        driver.get("https://www.bstackdemo.com")
        Assert.assertTrue(driver.title.contains("StackDemo"), "Title does not match")
        val productOnScreenText = driver.findElement(By.xpath("//*[@id='1']/p")).text
        driver.findElement(By.xpath("//*[@id='1']/div[4]")).click()
        Assert.assertTrue(
            driver.findElement(By.cssSelector(".float\\-cart__content")).isDisplayed,
            "Cart is not displayed"
        )
        val productOnCartText = driver.findElement(
            By.xpath("//*[@id='__next']/div/div/div[2]/div[2]/div[2]/div/div[3]/p[1]")
        ).text
        Assert.assertEquals(productOnScreenText, productOnCartText, "Product name mismatch")
    }

    @AfterMethod
    fun tearDown() {
        driver.quit()
    }
}
