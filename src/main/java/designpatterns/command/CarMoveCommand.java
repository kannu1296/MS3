package designpatterns.command;

public class CarMoveCommand implements CommandBase {
    private Car car;

    public CarMoveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.move();
    }

    @Override
    public void undo() {
        car.stop();
    }
}
