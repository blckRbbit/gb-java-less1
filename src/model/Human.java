package model;

public class Human {
    int age;
    private String name;
    String gender;
    private int salary;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
