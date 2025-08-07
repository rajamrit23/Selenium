package PlayWrightSessionss;
import com.microsoft.playwright.Playwright;
public class PW_Basic {

	public static void main(String[] args) {

		Playwright playwright=Playwright.create();
		playwright.chromium().launch();
	}

}
