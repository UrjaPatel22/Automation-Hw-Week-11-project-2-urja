package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setup(){
        openBrowser(baseUrl);
    }



//1. userShouldNavigateToForgotPasswordPageSuccessfully



@Test
public void userShouldNavigateToForgotPasswordPageSuccessfully() {


    //Click on the ‘Forgot your password’ link

    driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();


//* Verify the text Reset Password


    String expectedMessage ="Reset Password";
    WebElement actualTextElement = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
    String actualMessage = actualTextElement.getText();
    Assert.assertEquals("Error Message",expectedMessage,actualMessage);

}



    @After
    public void tearDown(){
        // closeBrowser();
    }


}
