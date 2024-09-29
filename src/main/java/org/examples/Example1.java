package org.examples;
import com.microsoft.playwright.*;

/**
 * The first example demo is launching a chrome browser - headless
 * Then navigates to playwright.dev
 * and prints the page title on console
 * @author ranjit singh
 * @Copyrights playwright
 */

public class Example1 {

	public static void main(String[] args) {
		try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://playwright.dev");
            System.out.println(page.title());
        }

	}

}
