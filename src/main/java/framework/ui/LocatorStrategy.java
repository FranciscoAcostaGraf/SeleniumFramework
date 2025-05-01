package framework.ui;

import org.openqa.selenium.By;

public class LocatorStrategy {

    public static By get(LocatorType type, String value) {
        switch (type) {
            case ID:
                return By.id(value);
            case NAME:
                return By.name(value);
            case CLASS_NAME:
                return By.className(value);
            case TAG_NAME:
                return By.tagName(value);
            case LINK_TEXT:
                return By.linkText(value);
            case PARTIAL_LINK_TEXT:
                return By.partialLinkText(value);
            case CSS_SELECTOR:
                return By.cssSelector(value);
            case XPATH:
                return By.xpath(value);
            case CONTAINS_TEXT:
                return By.xpath("//button[contains(text(), '" + value + "')]");    
            case NORMALIZE:
                return By.xpath("//a[normalize-space()='"+ value +"']");
            default:
                throw new IllegalArgumentException("Unsupported locator type: " + type);
        }
    }
}
