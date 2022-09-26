package phone;

/**
 * Создать пакет phone в котором создать классы:
 * Создайте класс Phone, который содержит поля number, model и weight.
 * ● Создайте три экземпляра (instance) этого класса.
 * ● Выведите в консоль их значения.
 * ● Добавить в класс Phone методы: receiveCall (один параметр – имя звонящего). Выводит на
 * консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона. Вызвать
 * эти методы для каждого из объектов
 * ● Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и
 * номер телефона звонящего. Вызвать этот метод.
 * ● Создать метод sendMessage с аргументами переменной длины. Данный метод принимает
 * на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на
 * консоль номера этих телефонов.
 * <p>
 * В корневой папке создать класс Main и в методе main() продемонстрировать работу всех
 * перечисленных выше методов и классов.
 */

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String receiveCall(String callerName) {
        System.out.println(getNumber() + callerName + " is calling to you ");
        return callerName;
    }


    public String receiveCall(String number, String callerName) {
        System.out.println(number + callerName + " is calling to you ");
        return number + callerName;
    }

    public void sendMessage(int... numbers) {
        for (int phoneNumbers : numbers) {
            System.out.println(phoneNumbers);
        }
    }
}