package thread;

public class Caller extends Thread {
    private CallMe callMe;
    private String message;

    public Caller(CallMe callMe, String message){
        this.callMe = callMe;
        this.message = message;
    }

    @Override
    public void run() {
        callMe.call(message);
    }
}
