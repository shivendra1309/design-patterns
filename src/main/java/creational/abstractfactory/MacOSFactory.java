package creational.abstractfactory;

public class MacOSFactory implements GuiFactory{

    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox(){
    return new MacOSCheckbox();
    }
}
