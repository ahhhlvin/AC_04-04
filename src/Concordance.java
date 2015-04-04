import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by alvin2 on 4/4/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */



public class Concordance {
    private static HashSet<String> excludedWords = new HashSet<String>();
    private Map<String, Set<Integer>> listing;


    public static void main(String[] args) {
        File file = new File("/Users/alvin2/Desktop/accesscode/AC_04-04/mobydick-chapter1-loomings.txt.html");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input banned words and type 'stop' upon entering last word: ");
        String bannedWord = input.nextLine();
        Concordance(file, excludedWords);



        while(true)
        {
            if(!bannedWord.equals("stop")){
            excludedWords.add(bannedWord);
        } else {
                continue;
            }
        }

    }




    public Concordance(String filename, Set<String> bannedWords) {

        Scanner scanner = new Scanner(filename);

        while(scanner.hasNext()) {
            if(bannedWords.contains(scanner.next())) {
                continue;
            } else {
                findLineNumbers(scanner.next());
            }
        }


    }

    public Set<Integer> findLineNumbers(String word) {
        HashSet<Integer> lineNum = new HashSet<Integer>();

        int num;

        if() {
            lineNum.add(num);
        }



    }

    public Set<Integer> getCommonLines(String word1, String word2) {

    }


    public void print() {

    }




}
