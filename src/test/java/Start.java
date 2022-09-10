import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {

    WebDriver wd;

    @Test

    public void stratTrello(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.close();
        wd.quit();
    }



    // for log in
    WebElement li1 = wd.findElement(By.cssSelector("[href='/login']"));
    WebElement li2 = wd.findElement(By.cssSelector("#user"));
    WebElement li3 = wd.findElement(By.cssSelector("#login"));
    WebElement li4 = wd.findElement(By.cssSelector("#password"));
    WebElement li5 = wd.findElement(By.cssSelector("#login-submit"));

    WebElement li6 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement li7 = wd.findElement(By.cssSelector(".m2N684FcksCyfT"));

    //log out
    WebElement li8 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-button']"));
    WebElement li9 = wd.findElement(By.cssSelector("[data-test-id='header-member-menu-logout']"));
    WebElement li10 = wd.findElement(By.cssSelector("#logout-submit"));

    WebElement li11 = wd.findElement(By.cssSelector("[href='/home']"));
    WebElement li12 = wd.findElement(By.cssSelector("[data-test-id='logo_link']"));
    WebElement li13 = wd.findElement(By.cssSelector("[data-test-id='bignav-tab']"));
}
