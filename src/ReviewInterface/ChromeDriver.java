package ReviewInterface;

public class ChromeDriver implements WebDriver {

    public ChromeDriver(){
        System.out.println("Launching Chrome Browser");


    }


    @Override
    public void get(String url) {
        System.out.println( "Chrome navigate to "+url);

    }

    @Override
    public void findElement(String locator) {
        System.out.println("ChromeDriver----locating element by "+ locator);

    }

    @Override
    public void quit() {
        System.out.println("Chrome Driver Killing all the opened sessions ");

    }

    @Override
    public String getTitle() {

        return " Chrome: EU-7 is the greatest";
    }

    public void uniqueMethodOfChrome(){
        System.out.println("It is unique to me cant call");

    }
}
