package command.remote;

import command.remote.commands.*;
import command.remote.devices.GarageDoor;
import command.remote.devices.Light;

public class RemoteTest {

    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingLight = new Light("living room");
        Stereo stereo = new Stereo();
        GarageDoor garageDoor = new GarageDoor();

        LightOnCommand livingLightOn = new LightOnCommand(livingLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingLight);

        StereoOnwithCDCommand stereoOnwithCD = new StereoOnwithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        remote.setOnCommand(0, livingLightOn);
        remote.setOffCommand(0, livingLightOff);

        remote.setOnCommand(1, stereoOnwithCD);
        remote.setOffCommand(1, stereoOff);

        remote.setOnCommand(2, garageDoorOpen);
        remote.setOffCommand(2, garageDoorDown);

        System.out.println("Remote set as " + remote);


        remote.onButtonWasPressed(1);
        remote.offButtonWasPressed(1);
        remote.onButtonWasPressed(2);

        remote.undoButtonWasPressed();
        remote.undoButtonWasPressed();

    }
}
