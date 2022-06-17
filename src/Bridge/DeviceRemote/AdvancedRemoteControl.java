package Bridge.DeviceRemote;

public class AdvancedRemoteControl extends RemoteControl{

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    void mute(){
        device.setVolume(0);
    }
}
