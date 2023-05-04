package AbstractFactory.ButtonExample;

public class Application {
    private Button button;
    private GUIFactory factory;

    public static void main(String[] args) {
        System.out.print("Hello");
    }

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
