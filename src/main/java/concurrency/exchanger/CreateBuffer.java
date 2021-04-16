package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class CreateBuffer implements Runnable {
    private Exchanger<String> exchanger;
    private String str;

    public CreateBuffer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run(){
        for(int i=0; i<3; i++){
            try {
                str = exchanger.exchange(new String());
                System.out.println(str);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
