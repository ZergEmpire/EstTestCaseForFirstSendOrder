package FirstTestCase;

import org.junit.Test;

public class TestClass extends TestBase {






    @Test
    public void userCanSendOrder() {
        openURL();
       /* RestSelect();*/
        /*GoMainPage();*/
        mathRandomHead();
        PickRandCards();
        GoBasket();
        SelectDeliveryTypePickUp();
        SelectTerminalForPickUp();
        fillInFields();
        SelectPayType();
        SendOrder();
        waitForComplete();



    }


}