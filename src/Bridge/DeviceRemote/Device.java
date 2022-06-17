package Bridge.DeviceRemote;

public interface Device {
    boolean isEnabled();

    void disable();

    void enable();

    int getVolume();

    void setVolume(int i);

    int getChannel();

    void setChannel(int i);
}
