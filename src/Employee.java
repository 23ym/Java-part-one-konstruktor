public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    String getInfo(int month) {
        return "Ім'я: " + name + ". \nПосада: " + position + ". \nЗа крайні " + month + " місяців отримав " + " $" + month * salary + ".";
    }
}
