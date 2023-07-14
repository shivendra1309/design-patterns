package creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


public class Mobile extends Gadget {
    private String displaySize;
    private String processor;

    public Mobile(String displaySize, String processor) {
        this.displaySize = displaySize;
        this.processor = processor;
    }

    @Override
    public String chargerType() {
        return "USB TYPE C";
    }
}
