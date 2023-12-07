public class PrinterAppl {
    public static void main(String[] args) { // Точка входа в программу
        Printer[] printers = new Printer[4]; // Создает массив из четырех принтеров

        for (int i = 0; i < printers.length; i++) { // Инициализирует принтеры
            printers[i] = new Printer(i);
        }

        for (int i = 0; i < printers.length; i++) { // Устанавливает для каждого принтера следующий принтер
            int nextIndex = (i + 1) % printers.length;
            printers[i].setNextNumber(printers[nextIndex]);
        }

        for (Printer printer : printers) { // Запускает все принтеры
            printer.start();
        }

        printers[0].interrupt(); // Прерывает первый принтер, начиная цепочку прерываний
    }
}