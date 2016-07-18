package TestPackage.NavigationPage;

import org.testng.annotations.Test;

import com.customize.reporter.WebReporter;

import Page.NavigationPage;
import TestCases.AbstractTestCases;

public class NavigationToPaymentPage extends AbstractTestCases {

    @Test(testName = "3", description = "通过导航栏进入到在线充值页面")
    public void navigationToPaymentPage() throws Exception {
        NavigationPage navigationPage = new NavigationPage(driver);
        navigationPage.clickPayPageLink();
        WebReporter.log(driver, driver.getTitle(), true, true);
    }

}
