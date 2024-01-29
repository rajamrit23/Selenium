package advanceSeleniumTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependentMethods {
@Test
public void createAccount() {
	Reporter.log("Account created successfully",true);
}
@Test
public void editAccount() {
	Reporter.log("Account edited successfully",true);
}
@Test(dependsOnMethods = {"editAccount","createAccount"})
public void deleteAccount() {
	Reporter.log("Account Deleted successfully",true);
}
}
