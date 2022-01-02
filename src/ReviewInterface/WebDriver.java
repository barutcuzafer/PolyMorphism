package ReviewInterface;

public interface WebDriver {
    //All of them abstract methods
    void get(String url);//public abstract
    void findElement(String locator);
    void quit();
    String getTitle();

}
