package Bridge.DeviceRemote;

public class Radio implements Device{
    private int volume;
    private int channel;
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void disable() {

    }

    @Override
    public void enable() {

    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int i) {
        this.volume=i;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int i) {
        channel=i;
    }
}
