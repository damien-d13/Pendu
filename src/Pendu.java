import java.util.Scanner;

public class Pendu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le mot a trouver" +
                "");
        String word = sc.nextLine();
        StringBuilder wordHide = new StringBuilder("");
        boolean succes = false;
        int nbTry = 9;
        int letterTry = 0;



        for (int k = 1; k <= word.length(); k++) {
            wordHide.append("*");
        }

        System.out.println(wordHide);
        System.out.println("Le mot a trouver fait : " + word.length() + " caractère");

        for (int i = 1; i <= nbTry; i++) {
            System.out.println("il vous reste " + nbTry);
            System.out.println("Proposer une lettre :");
            char letter = sc.next().charAt(0);
            StringBuilder  letterUsed = new StringBuilder("");
            letterUsed.append(letter);
            nbTry -= 1;

            for (int j = 0; j < word.length();j++) {
                if (word.charAt(j) == letter) {
                    wordHide.insert(j,letter);
                    System.out.println("La lettre apparait à la :" + i + " position.");
                    letterTry += 1;
                }
            }
            for ( int m = 1; m <= word.length(); m++){
                for (int n = 1; n <= word.length(); n++){
                    if(wordHide.charAt(m) == word.charAt(n)){
                        break;
                    }
                }

            }
        }

    }

}
