package entities;

import java.time.LocalDate;

public class Worker {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String workPlace;
    private LocalDate dayChange;
    private Enum STATUS;

    public Worker(int id, String name, int age, double salary, String workPlace) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workPlace = workPlace;
    }

    public LocalDate getDayChange() {
        return dayChange;
    }

    public void setDayChange(LocalDate dayChange) {
        this.dayChange = dayChange;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Enum getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(Enum STATUS) {
        this.STATUS = STATUS;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", workPlace='" + workPlace + '\'' +
                ", dayChange=" + dayChange +
                ", STATUS=" + STATUS +
                '}';
    }
}
