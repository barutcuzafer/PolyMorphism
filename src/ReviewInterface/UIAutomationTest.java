package ReviewInterface;

public class UIAutomationTest {
    public static void main(String[] args) {
       // WebDriver driver=new ChromeDriver();//Polymorphic way
        ChromeDriver driver1=new ChromeDriver();

        FirefoxDriver driver2=new FirefoxDriver();

        WebDriver driver=new ChromeDriver();

        driver1.get("www.practice.cybertekschool.com");
        driver1.findElement("//input[]@attribute='value']");
        driver1.getTitle();
        driver1.quit();

        driver2.get("www.practice.cybertekschool.com");
        driver2.findElement("//input[]@attribute='value']");
        driver2.getTitle();
        driver2.quit();

        driver.get("Cydeo");
        driver.quit();

        driver=new FirefoxDriver();
        driver.get("Wikipedia");
        driver.quit();

        driver=new ChromeDriver();
        ((ChromeDriver)driver).uniqueMethodOfChrome();;








}
}