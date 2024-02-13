package Exercice3;

public class Fractions {
    protected double a;  
    protected double b; 

    public Fractions(double x, double y) {
        this.a = x;
        this.b = (y != 0) ? y : 1.0;
    }

    public void Affiche() {
        System.out.println(a + " / " + b + " = " + (a / b));
    }

    public double DonneNum() {
        return a;
    }

    public double DonneDeno() {
        return b;
    }


    public void ChangeNum(double z) {
        this.a = z;
    }

    public void ChangeDeno(double z) {
        if (z != 0) {
            this.b = z;
        }
    }

    public void Inverse() {
        if (a != 0) {
            double temp = a;
            a = b;
            b = temp;
        }
    }
}
