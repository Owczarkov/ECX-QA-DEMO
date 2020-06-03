package demo.components;

import org.openqa.selenium.By;

public class Button extends BaseComponent {
    public Button(By buttonLocator) {
        super(buttonLocator);
    }

    public void click() {
        findElement(elementLocator).click();
    }
}
