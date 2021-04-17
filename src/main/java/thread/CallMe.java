package thread;

public class CallMe {

    public void call(String messsge){
        System.out.print("[" +" "+messsge);
        try{
            Thread.sleep(100);
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
        System.out.println(" "+"]");
    }
}
