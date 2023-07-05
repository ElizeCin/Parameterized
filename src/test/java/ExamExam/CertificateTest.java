package ExamExam;

import configuration.BaseClass1;
import data.DataProvider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.CertificatePage;

import java.util.Collection;

@RunWith(Parameterized.class)
public class CertificateTest extends BaseClass1 {

    String number;
    CertificatePage cert;

    @Parameterized.Parameters
    public static Collection<String> options() {
        return DataProvider.getNotvalidCertificate();
    }

    public CertificateTest(String number){
        this.number = number;
        driver.get("https://certificate.ithillel.ua/");
        cert = PageFactory.initElements(driver,CertificatePage.class);
    }

    @Test
    public void test1() throws Exception {
    cert.sendCertificate(number);
        Assert.assertFalse(cert.checkCertificateCheckForm());
    }
}
