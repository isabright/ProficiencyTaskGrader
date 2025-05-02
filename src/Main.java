import java.io.File;
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

            // declare arrays of word lists
//            ArrayList<String> word1 = new ArrayList<>();
//            ArrayList<String> word2 = new ArrayList<>();
//            ArrayList<String> word3 = new ArrayList<>();
//            ArrayList<String> word4 = new ArrayList<>();
//            ArrayList<String> word5 = new ArrayList<>();
//            ArrayList<String> word6 = new ArrayList<>();
//            ArrayList<String> word7 = new ArrayList<>();
//            ArrayList<String> word8 = new ArrayList<>();
//            ArrayList<String> word9 = new ArrayList<>();
//            ArrayList<String> word10 = new ArrayList<>();
//            ArrayList<String> word11 = new ArrayList<>();
//            ArrayList<String> word12 = new ArrayList<>();
//            ArrayList<String> word13 = new ArrayList<>();
//            ArrayList<String> word14 = new ArrayList<>();
//            ArrayList<String> word15 = new ArrayList<>();
//            ArrayList<String> word16 = new ArrayList<>();
//            ArrayList<String> word17 = new ArrayList<>();
//            ArrayList<String> word18 = new ArrayList<>();
//            ArrayList<String> word19 = new ArrayList<>();
//            ArrayList<String> word20 = new ArrayList<>();
//            ArrayList<String> word21 = new ArrayList<>();
//            ArrayList<String> word22 = new ArrayList<>();
//            ArrayList<String> word23 = new ArrayList<>();
//            ArrayList<String> word24 = new ArrayList<>();
//            ArrayList<String> word25 = new ArrayList<>();
//            ArrayList<String> word26 = new ArrayList<>();
//            ArrayList<String> word27 = new ArrayList<>();
//            ArrayList<String> word28 = new ArrayList<>();
//            ArrayList<String> word29 = new ArrayList<>();
//            ArrayList<String> word30 = new ArrayList<>();
//            ArrayList<String> word31 = new ArrayList<>();
//            ArrayList<String> word32 = new ArrayList<>();
//            ArrayList<String> word33 = new ArrayList<>();
//            ArrayList<String> word34 = new ArrayList<>();
//            ArrayList<String> word35 = new ArrayList<>();
//            ArrayList<String> word36 = new ArrayList<>();
//            ArrayList<String> word37 = new ArrayList<>();
//            ArrayList<String> word38 = new ArrayList<>();
//            ArrayList<String> word39 = new ArrayList<>();
//            ArrayList<String> word40= new ArrayList<>();
//
//            // add all lists to main list
//            ArrayList<ArrayList<String>> lists = new ArrayList<>();
//            lists.add(null);
//            lists.add(word1);
//            lists.add(word2);
//            lists.add(word3);
//            lists.add(word4);
//            lists.add(word5);
//            lists.add(word6);
//            lists.add(word7);
//            lists.add(word8);
//            lists.add(word9);
//            lists.add(word10);
//            lists.add(word11);
//            lists.add(word12);
//            lists.add(word13);
//            lists.add(word14);
//            lists.add(word15);
//            lists.add(word16);
//            lists.add(word17);
//            lists.add(word18);
//            lists.add(word19);
//            lists.add(word20);
//            lists.add(word21);
//            lists.add(word22);
//            lists.add(word23);
//            lists.add(word24);
//            lists.add(word25);
//            lists.add(word26);
//            lists.add(word27);
//            lists.add(word28);
//            lists.add(word29);
//            lists.add(word30);
//            lists.add(word31);
//            lists.add(word32);
//            lists.add(word33);
//            lists.add(word34);
//            lists.add(word35);
//            lists.add(word36);
//            lists.add(word37);
//            lists.add(word38);
//            lists.add(word39);
//            lists.add(word40);

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

//            for (int i = 1; i <= 40; ++i){
//                System.out.println(lists.get(i));
//            }


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