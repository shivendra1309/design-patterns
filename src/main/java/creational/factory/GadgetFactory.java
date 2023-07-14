package creational.factory;

public class GadgetFactory {
    public static Gadget getGadget(String gadgetType, String displaySize, String processor){
        if("mobile".equalsIgnoreCase(gadgetType)) return new Mobile(displaySize, processor);
        else return new Laptop(displaySize, processor);
    }
}
