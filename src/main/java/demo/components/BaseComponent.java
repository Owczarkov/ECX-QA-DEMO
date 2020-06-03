package demo.components;

import demo.AbstractComponent;
import org.openqa.selenium.By;

public class BaseComponent extends AbstractComponent {

    public BaseComponent(By elementLocator) {
        super(elementLocator);
    }

    public boolean isEnabled() {
        return findElement(elementLocator).isEnabled();
    }
}
