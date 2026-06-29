package Lesson6;

public class CreditCard {
    // Создать класс CreditCard c полями номер счета (строка), текущая сумма на счету (вещественная).
    // Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    // Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    // Добавьте метод, который выводит текущую информацию о карточке.
    // Напишите программу, которая создает три объекта класса CreditCard у которых заданы номер счета и начальная сумма
    // (начальная сумма вводится с консоли и не может быть меньше 0)
    // Тестовый сценарий для проверки:
    // Положите деньги на первые две карточки и снимите с третьей.
    // Выведите на экран текущее состояние всех трех карточек.

    private static long idCounter = 0;

    private final long id;
    private final String cardNumber;
    private double total;

    public CreditCard(String cardNumber, double sum) {
        this.id = ++idCounter;
        this.cardNumber = cardNumber;
        setTotal(sum);
    }

    public long getId() {
        return id;
    }

    public void setTotal(double total) {
        if (total < 0) {
            System.out.println("The sum cannot be less than 0!");
        } else this.total = total;
    }

    public void addMoney(double money) {
        this.total = total + money;
    }

    public void takeMoney(double money) {
        this.total = total - money;
    }

    public void cardInfo() {
        System.out.println("Card ID: " + getId());
        System.out.println("Card number: " + " " + cardNumber);
        System.out.println("Total: " + total);
    }
}
