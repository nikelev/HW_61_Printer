public class PrinterAppl {
    public static void main(String[] args) {
        Printer[] printers = new Printer[4];

        for (int i = 0; i < printers.length; i++) {
            printers[i] = new Printer(i);
        }



        for (int i = 0; i < printers.length; i++) {
            int nextIndex = (i + 1) % printers.length;
            printers[i].setNextNumber(printers[nextIndex]);
        }



        for (Printer printer : printers) {
            printer.start();
        }



        printers[0].interrupt();
    }
}