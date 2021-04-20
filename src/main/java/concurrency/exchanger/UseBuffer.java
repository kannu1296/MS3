package concurrency.exchanger;

import java.util.concurrent.Exchanger;

public class UseBuffer implements Runnable {
    private Exchanger<String> exchanger;
    private String str;

    public UseBuffer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

            for(int i=0; i<3; i++){
                for(int j=0; j<4; j++)
                    str += ch++;
                try {
                    str = exchanger.exchange(str);
            }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
        }
    }
}
