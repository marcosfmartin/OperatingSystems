public class CounterDesc extends Thread {
    private int counter;
    private String name;

    public CounterDesc (int counter, String name) {
        this.counter =  counter;
        this.name = name;
    }

    public void run() {
        try {
            for (; this.counter>0;this.counter--)
                System.out.println(this.name + ": " + this.counter);
                Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); }


    }

    public static void main(String[] args) {
        CounterDesc counterDesc = new CounterDesc(100, "T1");
        counterDesc.run();
    }

}