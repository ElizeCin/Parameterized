package ExamExam;

import data.Desigual;
import data.Language;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.DesigualPage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;

@RunWith(Parameterized.class)
public class DesigualTest extends Desigual {

    private final Language language;

    @Parameterized.Parameters
    public static Collection<Language> options() {
        return Arrays.asList(Language.values());
    }

    public DesigualTest(Language language) {
        this.language = language;
        if(!driver.getCurrentUrl().contains("https://www.desigual.com/" + language.getLang())){
            driver.get("https://www.desigual.com/" + language.getLang());
            desBundle = ResourceBundle.getBundle(language.getLang());
            desPage = PageFactory.initElements(driver, DesigualPage.class);
        }
    }

    @Test
    public void testSales() {
        Assert.assertEquals(desBundle.getString("tab1"), DesigualPage.tab1DesTest());
        System.out.println(driver.getTitle() + " in " + language);
    }

    @Test
    public void testNew() {
        Assert.assertEquals(desBundle.getString("tab2"), DesigualPage.tab2DesTest());
        System.out.println(driver.getTitle() + " in " + language);
    }

    @Test
    public void testBags() {
        Assert.assertEquals(desBundle.getString("tab3"), DesigualPage.tab3DesTest());
        System.out.println(driver.getTitle() + " in " + language);
    }
}
