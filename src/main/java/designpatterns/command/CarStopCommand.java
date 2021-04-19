package designpatterns.command;

public class CarStopCommand implements CommandBase {
    private Car car;

    public CarStopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        car.stop();
    }

    @Override
    public void undo() {
        car.move();
    }
}
