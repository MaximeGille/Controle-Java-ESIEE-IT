package Exercice3;

import java.util.Scanner;

public class TestFractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez x: ");
        int x = scanner.nextInt();
        System.out.print("Entrez y: ");
        int y = scanner.nextInt();

        Fractions f = new Fractions(x, y);
        f.Affiche();

        f.Inverse();
        f.Affiche();

        f.ChangeNum(f.DonneNum() + 1.5);
        f.ChangeDeno(f.DonneDeno() + 3.5);
        f.Affiche();

        FractionsOp g = new FractionsOp(2.4, 7.3);
        g.Affiche();
        g.Oppose();
        g.Affiche();

        scanner.close();
    }
}

