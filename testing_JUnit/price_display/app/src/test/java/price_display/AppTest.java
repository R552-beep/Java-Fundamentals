/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package price_display;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    @Test public void appDisplaysItemWithPrice() {
        App classUnderTest = new App();
        assertEquals("app should return item along with price", String.valueOf("The price for item: apple is 1"), classUnderTest.getPriceLabel("apple", 1));
    }
}