package creational.factory;

import lombok.AllArgsConstructor;

public class Laptop extends Gadget{
    private String displaySize;
    private String processor;

    public Laptop(String displaySize, String processor) {
        this.displaySize = displaySize;
        this.processor = processor;
    }

    @Override
    public String chargerType() {
        return "Adapter";
    }
}
