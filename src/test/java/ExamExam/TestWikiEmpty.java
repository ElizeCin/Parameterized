package ExamExam;

import configuration.BaseClass1;
import data.Language;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static exam.DATA.i;

@RunWith(Parameterized.class)
public class TestWikiEmpty extends BaseClass1 {

    private final Language language;

    @Parameterized.Parameters
    public static Collection<Language> options() {
        return Arrays.asList(Language.values());
    }

    public TestWikiEmpty(Language language) {
        this.language = language;
//        if(!driver.getCurrentUrl().contains("https://" + language.getLang() + ".wikipedia.org")) {
//            driver.get("https://" + language.getLang() + ".wikipedia.org");
//            System.out.println(i++);
//        }
        if(!driver.getCurrentUrl().contains("https://www.desigual.com/" + language.getLang())){
            driver.get("https://www.desigual.com/" + language.getLang());
            System.out.println(i++);
        }
    }

    @Test
    public void test() {
        System.out.println(driver.getTitle() + " in " + language);
    }

    @Test
    public void test2() {
        System.out.println(driver.getCurrentUrl());
    }
}

