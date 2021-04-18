package designpatterns.command;

public class RemoteControl {
    private CommandBase onCommand, offCommand, undoCommand;

    public void on(CommandBase onCommand){
        this.onCommand = onCommand;
        this.onCommand.execute();
        this.undoCommand = onCommand;
    }
    public void off(CommandBase offCommand){
        this.offCommand = offCommand;
        this.offCommand.execute();
        this.undoCommand = offCommand;
    }
    public void undo(){
        this.undoCommand.undo();
    }
}
