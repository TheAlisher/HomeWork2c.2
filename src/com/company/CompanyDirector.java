package com.company;

public class CompanyDirector extends OfficePlankton  {

    private String veryBigOccupation;
    private int goldenParachute;
    private int dividends;

    public CompanyDirector(String name, int age, int salary, String veryBigOccupation, int goldenParachute, int dividends) {
        super(name, age, salary);
        this.veryBigOccupation = veryBigOccupation;
        this.goldenParachute = goldenParachute;
        this.dividends = dividends;
    }

    public String getVeryBigOccupation() {
        return veryBigOccupation;
    }

    public void setVeryBigOccupation(String veryBigOccupation) {
        this.veryBigOccupation = veryBigOccupation;
    }

    public int getGoldenParachute() {
        return goldenParachute;
    }

    public void setGoldenParachute(int goldenParachute) {
        this.goldenParachute = goldenParachute;
    }

    public int getDividends() {
        return dividends;
    }

    public void setDividends(int dividends) {
        this.dividends = dividends;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(
                " | Очень большие обязанности: " + veryBigOccupation + " | Золотой парашют: "
                + goldenParachute + " | Дивиденды: " + dividends);
    }
}
