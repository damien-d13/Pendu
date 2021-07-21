import java.util.Scanner;

public class PenduTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le mot a trouver :");
        String word = sc.nextLine();
        StringBuilder wordHide = new StringBuilder();
        int nbTry = 9;
        int testTry = nbTry;
        StringBuilder  letterUsed = new StringBuilder();

        wordHide.append("*".repeat(word.length()));

        System.out.println(wordHide);
        System.out.println("Le mot a trouver fait : " + word.length() + " caractère");

        for (int i = 1; i <= nbTry; i++) {
            System.out.println("il vous reste " + testTry);
            System.out.println("Vous avez utiliser les lettres : " + letterUsed);
            System.out.println("Proposer une lettre : ");
            char letter = sc.next().charAt(0);
            letterUsed.append(letter);
            testTry -= 1;
//            System.out.println("yoooo");
            for (int j = 0; j < word.length();j++) {
                if (word.charAt(j) == letter) {
                    String addLetter = Character.toString(letter);
                    wordHide.delete(j,j + 1);
                    wordHide.replace(j, j, addLetter);
                    System.out.println("La lettre apparait à la : " + i + " position.");
                    System.out.println(wordHide);
                }

            }
//            System.out.println(nbTry);
            String wordEquals = wordHide.toString();
            if (wordEquals.equals(word)){
                System.out.println("Vous avez trouver le mot !!! BRAVO !!!");
                break;
            } else if(testTry == 0){
                System.out.println("Vous avez Perdu, le mot était : " + word);
                break;
            }
        }

    }

}
