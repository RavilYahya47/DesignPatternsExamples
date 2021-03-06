package AbstractFactory.ButtonExample;

public class Application {
    private Button button;
    private GUIFactory factory;

    public Application(GUIFactory guiFactory){
        this.factory=guiFactory;
    }

    public void createUI(){
        this.button=factory.createButton();
    }

    public void paint(){
        button.paint();
    }
}
