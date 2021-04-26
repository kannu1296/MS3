package memory.management;


public class BufferMemory extends SharedResourcesMemory {
    private int value = 0;
    public void add(){
        synchronized(this){
            producerList.add(value);
            value++;
        }
    }
    public int poll() {
        int poll;
        synchronized (this){
            poll = producerList.get(0);
        }
        return poll;
    }
}

