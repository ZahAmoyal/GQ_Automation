package Flows;

import PageObjects.SportFiveIsraeli;
import PageObjects.SportFiveOlami;
import org.openqa.selenium.WebDriver;

public class SportFiveFlow {

    SportFiveOlami sportFiveOlami;
    SportFiveIsraeli sportFiveIsraeli;


    public SportFiveFlow(WebDriver driver) {
        sportFiveOlami = new SportFiveOlami(driver);
        sportFiveIsraeli = new SportFiveIsraeli(driver);
    }

    public void flowSportFive() throws InterruptedException {
        sportFiveIsraeli.sportFiveIsraeli();
        sportFiveOlami.sportFiveOlami();
    }


}
