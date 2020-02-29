package com.company;

public class Chief extends OfficePlankton {

    private String occupation;

    public Chief(String name, int age, int salary, String occupation) {
        super(name, age, salary);
        this.occupation = occupation;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(
                " | Обязанности: " + occupation);
    }
}
