package demo.pages;

import org.openqa.selenium.By;

public class Shop extends AbstractPage {
    public Shop() {
        super(By.cssSelector(".shelf-container"));
    }
}
