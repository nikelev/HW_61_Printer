public class Printer extends Thread {
    private int number;
    Thread nextThread;

    public Printer(int number) {
        this.number = number;
    }

    public void setNextNumber(Thread nextThread) {
        this.nextThread = nextThread;
    }


    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(String.valueOf(number).repeat(10));
                if (nextThread != null) {
                    nextThread.interrupt();
                }
            }
        }
    }
}