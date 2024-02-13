package Exercice2;

public class SommeProduit {

    private int[] liste;


    public SommeProduit() {
        this.liste = new int[]{17, 89, 6, 8, 1, 45, 4, 2, 3};
    }


    public void Affiche() {
        for (int i = 0; i < liste.length; i++) {
            System.out.print(liste[i] + "\t");
        }

    }


    public int SommeImpairs() {
        int somme = 0;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 != 0) { 
                somme += liste[i];
            }
        }
        return somme;
    }


    public int ProduitPairs() {
        int produit = 1;
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] % 2 == 0) { 
                produit *= liste[i];
            }
        }
        return produit;
    }
}
