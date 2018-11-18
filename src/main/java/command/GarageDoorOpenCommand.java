package command;

import device.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor garageDoor){
        this.door = garageDoor;
    }

    public void execute() {
        door.open();
    }
}
