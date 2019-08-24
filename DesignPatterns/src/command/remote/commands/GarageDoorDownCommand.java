package command.remote.commands;

import command.remote.devices.GarageDoor;

public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void undo() {
        garageDoor.up();
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
