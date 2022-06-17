package Bridge.DeviceRemote;

public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        RemoteControl remote = new RemoteControl(tv);
        remote.togglePower();

        Radio radio = new Radio();
        AdvancedRemoteControl remoteControl = new AdvancedRemoteControl(radio);
    }

}
