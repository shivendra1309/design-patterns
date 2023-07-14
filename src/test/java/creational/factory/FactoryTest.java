package creational.factory;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest{

    @Test
    public void testMobile(){
        Gadget mobile = GadgetFactory.getGadget("mobile","24", "AMD");
        System.out.println(mobile instanceof Mobile);
        System.out.println( mobile.getDisplaySize() + mobile.getProcessor());
        assertEquals(mobile.chargerType(),"USB TYPE C");
    }

}
