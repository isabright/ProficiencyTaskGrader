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
            ArrayList<String> word1 = new ArrayList<>();
            ArrayList<String> word2 = new ArrayList<>();
            ArrayList<String> word3 = new ArrayList<>();
            ArrayList<String> word4 = new ArrayList<>();
            ArrayList<String> word5 = new ArrayList<>();
            ArrayList<String> word6 = new ArrayList<>();
            ArrayList<String> word7 = new ArrayList<>();
            ArrayList<String> word8 = new ArrayList<>();
            ArrayList<String> word9 = new ArrayList<>();
            ArrayList<String> word10 = new ArrayList<>();
            ArrayList<String> word11 = new ArrayList<>();
            ArrayList<String> word12 = new ArrayList<>();
            ArrayList<String> word13 = new ArrayList<>();
            ArrayList<String> word14 = new ArrayList<>();
            ArrayList<String> word15 = new ArrayList<>();
            ArrayList<String> word16 = new ArrayList<>();
            ArrayList<String> word17 = new ArrayList<>();
            ArrayList<String> word18 = new ArrayList<>();
            ArrayList<String> word19 = new ArrayList<>();
            ArrayList<String> word20 = new ArrayList<>();
            ArrayList<String> word21 = new ArrayList<>();
            ArrayList<String> word22 = new ArrayList<>();
            ArrayList<String> word23 = new ArrayList<>();
            ArrayList<String> word24 = new ArrayList<>();
            ArrayList<String> word25 = new ArrayList<>();
            ArrayList<String> word26 = new ArrayList<>();
            ArrayList<String> word27 = new ArrayList<>();
            ArrayList<String> word28 = new ArrayList<>();
            ArrayList<String> word29 = new ArrayList<>();
            ArrayList<String> word30 = new ArrayList<>();
            ArrayList<String> word31 = new ArrayList<>();
            ArrayList<String> word32 = new ArrayList<>();
            ArrayList<String> word33 = new ArrayList<>();
            ArrayList<String> word34 = new ArrayList<>();
            ArrayList<String> word35 = new ArrayList<>();
            ArrayList<String> word36 = new ArrayList<>();
            ArrayList<String> word37 = new ArrayList<>();
            ArrayList<String> word38 = new ArrayList<>();
            ArrayList<String> word39 = new ArrayList<>();
            ArrayList<String> word40= new ArrayList<>();

            // add all lists to main list
            ArrayList<ArrayList> lists = new ArrayList<>();
            lists.add(null);
            lists.add(word1);
            lists.add(word2);
            lists.add(word3);
            lists.add(word4);
            lists.add(word5);
            lists.add(word6);
            lists.add(word7);
            lists.add(word8);
            lists.add(word9);
            lists.add(word10);
            lists.add(word11);
            lists.add(word12);
            lists.add(word13);
            lists.add(word14);
            lists.add(word15);
            lists.add(word16);
            lists.add(word17);
            lists.add(word18);
            lists.add(word19);
            lists.add(word20);
            lists.add(word21);
            lists.add(word22);
            lists.add(word23);
            lists.add(word24);
            lists.add(word25);
            lists.add(word26);
            lists.add(word27);
            lists.add(word28);
            lists.add(word29);
            lists.add(word30);
            lists.add(word31);
            lists.add(word32);
            lists.add(word33);
            lists.add(word34);
            lists.add(word35);
            lists.add(word36);
            lists.add(word37);
            lists.add(word38);
            lists.add(word39);
            lists.add(word40);



            int list = 0;
            String data;

            // populate arrays with words from file
            while (wordReader.hasNext()){

                data = wordReader.nextLine();
                if (data.isEmpty()){
                    continue;
                }
                if (isNumeric(data)){
                    list = Integer.parseInt(data);
                    continue;
                }
                lists.get(list).add(data);

//                if (list == 1)
//                    word1.add(data);
//                if (list == 2)
//                    word2.add(data);
//                if (list == 3)
//                    word3.add(data);
//                if (list == 4)
//                    word4.add(data);
//                if (list == 5)
//                    word5.add(data);
//                if (list == 6)
//                    word6.add(data);
//                if (list == 7)
//                    word7.add(data);
//                if (list == 8)
//                    word8.add(data);
//                if (list == 9)
//                    word9.add(data);
//                if (list == 10)
//                    word10.add(data);
//                if (list == 11)
//                    word11.add(data);
//                if (list == 12)
//                    word12.add(data);
//                if (list == 13)
//                    word13.add(data);
//                if (list == 14)
//                    word14.add(data);
//                if (list == 15)
//                    word15.add(data);
//                if (list == 16)
//                    word16.add(data);
//                if (list == 17)
//                    word17.add(data);
//                if (list == 18)
//                    word18.add(data);
//                if (list == 19)
//                    word19.add(data);
//                if (list == 20)
//                    word20.add(data);
//                if (list == 21)
//                    word21.add(data);
//                if (list == 22)
//                    word22.add(data);
//                if (list == 23)
//                    word23.add(data);
//                if (list == 24)
//                    word24.add(data);
//                if (list == 25)
//                    word25.add(data);
//                if (list == 26)
//                    word26.add(data);
//                if (list == 27)
//                    word27.add(data);
//                if (list == 28)
//                    word28.add(data);
//                if (list == 29)
//                    word29.add(data);
//                if (list == 30)
//                    word30.add(data);
//                if (list == 31)
//                    word31.add(data);
//                if (list == 32)
//                    word32.add(data);
//                if (list == 33)
//                    word33.add(data);
//                if (list == 34)
//                    word34.add(data);
//                if (list == 35)
//                    word35.add(data);
//                if (list == 36)
//                    word36.add(data);
//                if (list == 37)
//                    word37.add(data);
//                if (list == 38)
//                    word38.add(data);
//                if (list == 39)
//                    word39.add(data);
//                if (list == 40)
//                    word40.add(data);
            } // end While


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
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}