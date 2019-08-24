package command.remote;

import command.remote.commands.Command;
import command.remote.commands.NoCommand;
import java.util.Stack;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Stack<Command> undoCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommands = new Stack<>();
    }

    public void setOnCommand(int slot, Command onCommand) {
        onCommands[slot] = onCommand;
    }

    public void setOffCommand(int slot, Command offCommand) {
        offCommands[slot] = offCommand;
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n-------- Remote Control --------\n");
        for (int i = 0; i < onCommands.length; i++ ) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        undoCommands.push(onCommands[slot]);
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        undoCommands.push(offCommands[slot]);
    }

    public void undoButtonWasPressed() {
        if (!undoCommands.empty()) {
            undoCommands.pop().execute();
        }
    }
}
