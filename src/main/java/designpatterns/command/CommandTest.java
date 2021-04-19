package designpatterns.command;

public class CommandTest {
    public static void main(String[] args) {
        Car car = new Car();
        Airplane airplane = new Airplane();
        RemoteControl remoteControl = new RemoteControl();

        CommandBase commandBase = new CarMoveCommand(car);
        remoteControl.on(commandBase);
        remoteControl.undo();

        commandBase = new AirplaneMoveCommand(airplane);
        remoteControl.on(commandBase);
        remoteControl.undo();

    }
}
