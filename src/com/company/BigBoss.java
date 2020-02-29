package com.company;

public class BigBoss extends OfficePlankton {

    private String bigOccupation;
    private int salaryBonus;

    public BigBoss(String name, int age, int salary, String bigOccupation, int salaryBonus) {
        super(name, age, salary);
        this.bigOccupation = bigOccupation;
        this.salaryBonus = salaryBonus;
    }

    public String getBigOccupation() {
        return bigOccupation;
    }

    public void setBigOccupation(String bigOccupation) {
        this.bigOccupation = bigOccupation;
    }

    public int getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(int salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(
                " | Большие обязанности: " + bigOccupation + " | Бонус ЗП: " +  salaryBonus);
    }
}
