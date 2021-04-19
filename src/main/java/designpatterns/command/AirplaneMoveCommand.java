package designpatterns.command;

public class AirplaneMoveCommand implements CommandBase {
    private Airplane airplane;

    public AirplaneMoveCommand(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void execute() {
        airplane.fly();
    }

    @Override
    public void undo() {
        airplane.stop();
    }
}
