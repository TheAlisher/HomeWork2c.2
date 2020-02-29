package com.company;

public class Main {

    public static void main(String[] args) {


       /* Chief chief = new Chief("Larry", 20,30_000,"Указывает что бделать сотрудникам");
        chief.print();


        BigBoss bigBoss = new BigBoss("Johny", 23,50_000,"Указывает что делать шефам",
                300);
        bigBoss.print();


        CompanyDirector companyDirector = new CompanyDirector("Tommy", 21,100_000,
                "Указывает что делать все", 22,44);
        companyDirector.print();*/

        createObject("1").print();
        System.out.println("____________________________");
        System.out.println(" ");
        createObject("2").print();
        System.out.println("____________________________");
        System.out.println(" ");
        createObject("3").print();
    }

    public static Printable createObject(String className) {

        Printable personal = null;

        switch (className) {
            case "1":
                personal = new Chief("Larry", 20, 30_000, "Указывает что бделать сотрудникам");
                break;
            case "2":
                personal = new BigBoss("Johny", 23, 50_000, "Указывает что делать шефам",
                        300);
                break;
            case "3":
                personal = new CompanyDirector("Tommy", 21, 100_000,
                        "Указывает что делать все", 22, 44);
                break;
        }

        return personal;
    }
}
