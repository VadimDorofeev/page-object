package Tests;

import Pages.AdminPage;
import org.testng.annotations.Test;

public class LoginTest extends AdminBaseTest {

    @Test
    public void test() {
        AdminPage adminPage = new AdminPage(driver);
        adminPage.login(username,password);
    }
}
