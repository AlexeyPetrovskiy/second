package device;

import command.Command;

public class RemoteControl {
    public void setCommand(Command slot) {
        this.slot = slot;
    }

    Command slot;

  public void buttonPressed(){
      slot.execute();
  }

}
