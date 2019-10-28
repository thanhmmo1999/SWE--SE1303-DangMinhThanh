/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanhexercise6;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class ThanhExercise6 {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static String repeatfunc(String s) {
        String[] words = s.split("\\s");
        ArrayList<String> words2 = new ArrayList<>();
        String result = "";
        int k = 0;
        for (String w : words) {
            words2.add(w);
        }
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < words2.size(); i++) {
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) {
                    index.add(j);
                    words2.set(i, "REPEAT");
                } else {
                    break;
                }
            }
        }
        for (Integer integer : index) {
            words2.set(integer, "");
        }
        for (String string : words2) {
            if (!string.equals("")) {
                result += string + " ";
            }
        }
        result = result.replace("\\s+", "");
        return result;
    }

    public static void main(String[] args) {
        //case 1
        System.out.println("case 1");
        System.out.println("I want to to go to the the zoo");
        System.out.println("Expect out: I want REPEAT go to REPEAT zoo");
        System.out.println("Release: " + repeatfunc("I want to to go to the the zoo"));
        System.out.println("=================================================");
        System.out.println();

        System.out.println("case 2");
        System.out.println("I want to to to go to the zoo");
        System.out.println("Expect out: I want REPEAT go to the zoo");
        System.out.println("Release: " + repeatfunc("I want to to to go to the zoo"));
        System.out.println("=================================================");
        System.out.println();

        System.out.println("case 3");
        System.out.println("I want to go to the to zoo to");
        System.out.println("Expect out: I want to go to the to zoo to");
        System.out.println("Release: " + repeatfunc("I want to go to the to zoo to"));
        System.out.println("=================================================");
        System.out.println();

        System.out.println("case 4");
        System.out.println("I want to Go go to the zoo");
        System.out.println("Expect out: I want to Go go to the zoo");
        System.out.println("Release: " + repeatfunc("I want to Go go to the zoo"));
        System.out.println("=================================================");
        System.out.println();

        System.out.println("case 5");
        System.out.println("I I want to go to the zoo zoo");
        System.out.println("Expect out: I want to go to the zoo");
        System.out.println("Release: " + repeatfunc("I I want to go to the zoo zoo"));
        System.out.println("=================================================");
        System.out.println();

    }
}
