package Exercice1;

public class Matrice {

    private int[][] T;

 
    public Matrice() {
        T = new int[][] {
            {1, 5, -3, 4},
            {2, 14, 0, -7},
            {8, 11, 20, 3}
        };
    }


    public void Affiche() {
        for(int i = 0; i < T.length; i++) {
            for(int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public void AfficheTransposee() {

        for(int i = 0; i < T[0].length; i++) { 
            for(int j = 0; j < T.length; j++) {
                System.out.print(T[j][i] + "\t"); 
            }
            System.out.println();
        }
    }


}

