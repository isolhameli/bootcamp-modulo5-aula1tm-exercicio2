package bootcamp;


import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Exercicio2 {
    public static void main(String[] args) {
        double comapanyXCapital = 1.13;
        double companyXRate = 1.48;
        double companyYCapital = 18.4;
        double companyYRate = 0.32;

        calculateGrowth(comapanyXCapital, companyXRate, companyYCapital, companyYRate);


    }

    public static void calculateGrowth(double companyXCapital, double companyXRate, double companyYCapital,
                                       double companyYRate) {

        NumberFormat formatter = new DecimalFormat("#0.00");
        int year = 2021;
        while (companyYCapital > companyXCapital) {
            System.out.println("Empresa X - 01/01/" + year + " - " + formatter.format(companyXCapital) + "m / " +
                    "Empresa Y - 01/01/" + year + " - " + formatter.format(companyYCapital) + "m");
            companyXCapital = companyXCapital * (1 + companyXRate);
            companyYCapital = companyYCapital * (1 + companyYRate);
            year += 1;
        }
        System.out.println("Empresa X - 01/01/" + year + " - " + formatter.format(companyXCapital) + "m / " +
                "Empresa Y - 01/01/" + year + " - " + formatter.format(companyYCapital) + "m");
    }
}
