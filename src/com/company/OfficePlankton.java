package com.company;

public class OfficePlankton implements Printable{

    private String name;
    private int age;
    private int Salary;

    public OfficePlankton(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        Salary = salary;
    }

    public String getName() {
        return name;
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

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public void print() {
        System.out.println(" | Имя: " + getName() + " | Возраст: " + getAge() + " | ЗП: " + getSalary());
    }
}
