public class CounterAsc implements Runnable {
    private int counter;
    private String name;

    public CounterAsc (int counter, String name) {
        this.counter =  counter;
        this.name = name;
    }


    @Override
    public void run() {
        try {
            for (; this.counter<=100;this.counter++)
                System.out.println(this.name + ": " + this.counter);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); }


    }

    public static void main(String[] args) {

        CounterAsc counterAsc = new CounterAsc(0, "T2");
        Thread thread = new Thread(counterAsc);
        thread.start();
    }

}