package command.remote.commands;

public class StereoOnwithCDCommand implements Command{

    private Stereo stereo;

    public StereoOnwithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
