package Exercice1;

public class TestMatrice {
    public static void main(String[] args) {
        
        Matrice matrice = new Matrice();
        
        System.out.println("Matrice T:");
        matrice.Affiche();
        
        System.out.println("\nMatrice transposée de T:");
        matrice.AfficheTransposee();
    }
}

