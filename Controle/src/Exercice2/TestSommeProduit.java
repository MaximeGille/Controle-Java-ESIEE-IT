package Exercice2;

public class TestSommeProduit {
    public static void main(String[] args) {

        SommeProduit sp = new SommeProduit();

        System.out.println("Les éléments de la liste sont : ");
        sp.Affiche();


        System.out.println("\nLa somme des éléments impairs de la liste est : " + sp.SommeImpairs());


        System.out.println("\nLe produit des éléments pairs de la liste est : " + sp.ProduitPairs());
    }
}


