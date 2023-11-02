//Scrivere un programma che contenga un metodo che permette di inizializzare una matrice e di scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza
//
//1 2 3
//4 5 6
//Matrice risultato
//
// 1 4
// 2 5
// 3 6


public class Main {
    public static void main(String[] args) {
        String[][] num = {{"1", "2", "3"}, {"4", "5", "6"}};

        matrice(num);
        System.out.println("");
        matrice(matriceRisultato(num));
    }

    private static void matrice(String[][] num) {

        for (int riga = 0; riga < num.length; riga++) {
            System.out.println(" ");
            for (int colonna = 0; colonna < num[riga].length; colonna++) {
                System.out.print(num[riga][colonna] + " ");
                           }

        }

    }
    public static String[][] matriceRisultato(String[][]matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        String[][] transposedMatrix = new String[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }

        }
        return transposedMatrix;
    }



}

