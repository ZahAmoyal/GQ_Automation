package Tests;

import org.junit.Test;

public class SportFiveTests extends BaseTest {

    @Test
    public void sportNews() throws InterruptedException {
        try {
            sportFiveFlow.flowSportFive();
            oneFlow.flowOne();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        sportFiveFlow.flowSportFive();
//        oneFlow.flowOne();
    }
}
