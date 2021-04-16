package dining.philosipher;

/**
 * Example to represent Semaphore
 */
public class DiningPhilosipherTest {
    public static void main(String[] args) {
        Philosipher[] philosiphers = new Philosipher[DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS];
        Chopstick[] chopsticks = new Chopstick[DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS];

        for(int i=0; i<DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS; i++){
            chopsticks[i] = new Chopstick();
        }
        for(int i=0; i<DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS; i++){
            if(i != DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS - 1){
                philosiphers[i] = new Philosipher(i, chopsticks[i], chopsticks[(i+1) % DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS]);
                philosiphers[i].start();
            }else{
                philosiphers[i] = new Philosipher(i, chopsticks[0], chopsticks[(i) % DiningPhilosipherConstant.NUMBER_OF_PHILOSIPHERS]);
                philosiphers[i].start();
            }

        }
    }
}
