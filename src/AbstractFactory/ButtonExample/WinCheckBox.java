package AbstractFactory.ButtonExample;

public class WinCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Render a checkbox in Windows style");
    }
}
