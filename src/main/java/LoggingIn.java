

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class LoggingIn {
    public static void main (String[] args) throws InterruptedException {
        logIn();
    }
    public static void logIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kenji\\Documents\\PROGRAMMING\\UdemyCourse\\chromedriver_win32\\chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://courses.rahulshettyacademy.com/");
        chromeDriver.findElement(By.xpath("//a[@class='theme-btn']")).click();
        chromeDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("azawstephens@outlook.com");
        chromeDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("passwordIsThePassword");
        chromeDriver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.linkText("Azaw Stephens")).click();
        chromeDriver.findElement(By.linkText("Contact")).click();
        chromeDriver.findElement(By.name("subject")).sendKeys("A message to Shetty");
        chromeDriver.findElement(By.name("student_message")).sendKeys("So, I was going to write you a message and send it but I realized you'd keep receiving the same message every time I run this program. Therefore I won't send this. Instead I'll navigate back and log out.");
        Thread.sleep(10000);
        chromeDriver.navigate().back();
        Thread.sleep(1000);
        chromeDriver.findElement(By.linkText("Azaw Stephens")).click();
        Thread.sleep(1000);
        chromeDriver.findElement(By.linkText("Log Out")).click();
    }
}
