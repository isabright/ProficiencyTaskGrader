import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            File wordList = new File(args[0]);
            File partResp = new File(args[1]);
            Scanner wordReader = new Scanner(wordList);
            Scanner respReader = new Scanner(partResp);
            FileWriter wtr = new FileWriter("results.txt");

            ArrayList<ArrayList<String>> lists = new ArrayList<>();
            lists.add(null);
            for (int i = 0; i < 40; ++i){
                lists.add(new ArrayList<String>());
            }

            int list = 0;
            String data;

            // populate arrays with words from file
            while (wordReader.hasNext()){
                data = wordReader.nextLine();
                if (data.isEmpty()){
                    continue;
                }
                if (isNumeric(data)){
                    list = Integer.parseInt(data.trim());
                    continue;
                }
                lists.get(list).add(data);
            } // end While

            int score = 0;
            int count = 1;
            System.out.println("\nHere are the anomalous responses: \n");
            while (respReader.hasNext()){
                data = respReader.nextLine();
                if (containsCaseInsensitive(data, lists.get(count))) {
                    ++score;
                } else {
                    System.out.println("For word " + count + " participant responded with: " + data);
                }
                ++count;
            } // end while

            System.out.println("\nThe score excluding anomolies is: " + score + "\n");
        } catch (Exception e) {
            System.out.print("An error occured: ");
            e.printStackTrace();
        }


    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum.trim());
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean containsCaseInsensitive(String s, ArrayList<String> l){
        for (String string : l){
            if (string.equalsIgnoreCase(s.trim())){
                return true;
            }
        }
        return false;
    }
}