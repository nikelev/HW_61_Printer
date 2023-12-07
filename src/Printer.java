public class Printer extends Thread {
    private int number; // Номер принтера
    Thread nextThread; // Ссылка на следующий поток

    public Printer(int number) { // Конструктор класса
        this.number = number; // Инициализация номера принтера
    }

    public void setNextNumber(Thread nextThread) { // Установка следующего потока
        this.nextThread = nextThread;
    }

    public void run() { // Метод, который выполняется при запуске потока
        for (int i = 0; i < 10; i++) { // Цикл выполняется 10 раз
            try {
                Thread.sleep(1000); // Поток "спит" в течение одной секунды
            } catch (InterruptedException e) { // Если поток прерывается во время сна
                System.out.println(String.valueOf(number+1).repeat(10)); // Печатает строку, состоящую из номера принтера, повторенного 10 раз
                if (nextThread != null) {
                    nextThread.interrupt(); // Прерывает следующий поток, если он существует
                }
            }
        }
    }
}