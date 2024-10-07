package oop_classactivity3;

public class Main {

    public static void main(String[] args) {

        Uba uba = new Uba(10);
        Zenith zenith = new Zenith(9);
        Gtbank gtbank = new Gtbank(7);

        System.out.println("UBA: " + uba.getInterestRate() + "%");
        System.out.println("ZENITH: " + zenith.getInterestRate() + "%");
        System.out.println("GTBANK: " + gtbank.getInterestRate() + "%");
    }




}
