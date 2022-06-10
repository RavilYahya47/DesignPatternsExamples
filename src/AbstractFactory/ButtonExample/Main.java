package AbstractFactory.ButtonExample;

public class Main {
    public static void main(String[] args) throws Exception {
        String os = "MacOs";
        GUIFactory factory;
        if(os.equals("Windows"))
            factory=new WinFactory();
        else if (os.equals("MacOs"))
            factory = new MacFactory();
        else throw new Exception("Error! Unknows operating system!");

        Application app = new Application(factory);
        app.createUI();
        app.paint();

    }
}
