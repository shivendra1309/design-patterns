package creational.factory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public abstract class Gadget {
    public String getDisplaySize() {
        return displaySize;
    }

    public String getProcessor() {
        return processor;
    }

    private String displaySize;
    private String processor;

    public abstract String chargerType();

}
