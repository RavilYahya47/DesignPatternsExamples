package AbstractFactory.ButtonExample;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("Render a checkbox in macOS style");
    }
}
