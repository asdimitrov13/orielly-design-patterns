package command.remote.commands;

public class Stereo {

    private int volume;

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo off");
    }

    public void setCd() {
        System.out.println("stereo cd set");
    }

    public void setDvd() {
        System.out.println("stereo dvd set");
    }

    public void setRadio() {
        System.out.println("stereo radio set");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("stereo volume set to " + volume);
    }
}
