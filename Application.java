public class Application {
    public static void main(String[] args){
        //Producer p0=new Producer("demo");
        //Producer p1=new Producer("elso");
        //Producer p2=new Producer("masodik");
        Fifo f=new Fifo();

        Producer p=new Producer("produce", f, 1000);
        Consumer c=new Consumer(f, "consume", 500);
        //p0.go();
        //p1.start();
        //Thread.sleep(500);
        //p2.start();
        p.start();
        c.start();
    }
}
