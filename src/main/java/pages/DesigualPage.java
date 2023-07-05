package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DesigualPage {
    @FindBy(id = "cat-sales")
    static WebElement tab1;
    @FindBy(id = "cat-new.in")
    static WebElement tab2;
    @FindBy(id = "cat-woman-bags.backpacks")
    static WebElement tab3;
    public static String tab1DesTest(){
        return tab1.findElement(By.tagName("span")).getText();
    }
    public static String tab2DesTest(){
        return tab2.findElement(By.tagName("span")).getText();
    }
    public static String tab3DesTest(){
        return tab3.findElement(By.tagName("span")).getText();
    }
}
