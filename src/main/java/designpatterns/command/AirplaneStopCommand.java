package designpatterns.command;

public class AirplaneStopCommand implements CommandBase {
    private Airplane airplane;

    public AirplaneStopCommand(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void execute() {
        airplane.stop();
    }

    @Override
    public void undo() {
        airplane.fly();
    }
}
