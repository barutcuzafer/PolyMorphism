package ReviewInterface;

public class FirefoxDriver implements WebDriver{

    public FirefoxDriver(){
        System.out.println("Launching Chrome Browser");
    }


    @Override
    public void get(String url) {
        System.out.println( "Firefox navigate to "+url);
    }

    @Override
    public void findElement(String locator) {
        System.out.println("FirefoxDriver----locating element by "+ locator);
    }

    @Override
    public void quit() {
        System.out.println("FirefoxDriver Killing all the opened sessions ");
    }

    @Override
    public String getTitle() {
        return "Firefox: EU-7 is the greatest";
    }

}
