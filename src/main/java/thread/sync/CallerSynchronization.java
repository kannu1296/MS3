package thread.sync;

public class CallerSynchronization implements Runnable {
    private CallMeWithSynchronization callMe;
    private String msg;

    public CallerSynchronization(CallMeWithSynchronization callMe, String msg){
        this.callMe = callMe;
        this.msg = msg;
    }

    @Override
    public void run() {
        callMe.call(msg);
    }
}
