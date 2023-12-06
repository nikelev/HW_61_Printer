public class Printer extends Thread {
    private int number;
    Thread nextThread;

    public Printer(int number) {
        this.number = number;
    }

    public void setNextNumber(Thread nextThread) {
        this.nextThread = nextThread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++){
                System.out.println(String.valueOf(number).repeat(10));
                Thread.sleep(1000);
            }
            if (nextThread != null) {
                nextThread.interrupt();
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}