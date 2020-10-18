package com.Aedan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class translator {
    static String wide(String alg) {
        //Scanner scanner = new Scanner(System.in);
        ArrayList<String> centerpos = new ArrayList<String>();
        centerpos.add("U"); centerpos.add("BL"); centerpos.add("FL"); centerpos.add("FF"); centerpos.add("FR"); centerpos.add("BR"); centerpos.add("BB"); centerpos.add("D");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "f", "u"};
        ArrayList<String> finalalg = new ArrayList<String>();
        //System.out.print("alg: ");
        //String alg = scanner.nextLine();
        String[] algarray = alg.split(" ");
        for (int j=0; j<algarray.length;j++) {
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            if (algarray[j].contains("f")) {
                Collections.swap(centerpos, 0, 4); Collections.swap(centerpos, 0, 2); Collections.swap(centerpos, 5, 7); Collections.swap(centerpos, 5, 1);
                if (algarray[j].contains("'")) {
                    Collections.swap(centerpos, 0, 4); Collections.swap(centerpos, 0, 2); Collections.swap(centerpos, 5, 7); Collections.swap(centerpos, 5, 1);
                }
            }
            if (algarray[j].contains("u")) {
                Collections.swap(centerpos, 4, 2); Collections.swap(centerpos, 4, 6); Collections.swap(centerpos, 3, 1); Collections.swap(centerpos, 3, 5);
                if (algarray[j].contains("'")) {
                    Collections.swap(centerpos, 4, 2); Collections.swap(centerpos, 4, 6); Collections.swap(centerpos, 3, 1); Collections.swap(centerpos, 3, 5);
                }
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);

        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
            //sb.append("/t");
        }
        return sb.toString();
        //System.out.println(sb.toString());

    }
    static String xrot(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        ArrayList<String> finalalg = new ArrayList<String>();
        centerpos.add("BB"); centerpos.add("D"); centerpos.add("FL"); centerpos.add("BL"); centerpos.add("U"); centerpos.add("BR"); centerpos.add("FR"); centerpos.add("FF");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        for (int j=0;j<algarray.length;j++){
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }
    static String yrot(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        ArrayList<String> finalalg = new ArrayList<String>();
        centerpos.add("U"); centerpos.add("BR"); centerpos.add("BB"); centerpos.add("BL"); centerpos.add("FL"); centerpos.add("FF"); centerpos.add("FR"); centerpos.add("D");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        for (int j=0;j<algarray.length;j++){
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }
    static String zrot(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        ArrayList<String> finalalg = new ArrayList<String>();
        centerpos.add("FR"); centerpos.add("BR"); centerpos.add("U"); centerpos.add("FF"); centerpos.add("FL"); centerpos.add("D"); centerpos.add("BB"); centerpos.add("BL");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        for (int j=0;j<algarray.length;j++){
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }

    static String trot(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        ArrayList<String> finalalg = new ArrayList<String>();
        centerpos.add("BR"); centerpos.add("BB"); centerpos.add("BL"); centerpos.add("U"); centerpos.add("FF"); centerpos.add("FR"); centerpos.add("D"); centerpos.add("FL");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        for (int j=0;j<algarray.length;j++){
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }
    static String widen(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        centerpos.add("U"); centerpos.add("Rw"); centerpos.add("FL"); centerpos.add("FF"); centerpos.add("FR"); centerpos.add("BR"); centerpos.add("BB"); centerpos.add("D");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        ArrayList<String> finalalg = new ArrayList<String>();
        for (int j=0;j<algarray.length;j++) {
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            if (algarray[j].contains("BL")) {
                Collections.swap(centerpos, 0, 2); Collections.swap(centerpos, 0, 6); Collections.swap(centerpos, 3, 7); Collections.swap(centerpos, 3, 5);
                if (algarray[j].contains("'")) {
                    Collections.swap(centerpos, 0, 2); Collections.swap(centerpos, 0, 6); Collections.swap(centerpos, 3, 7); Collections.swap(centerpos, 3, 5);
                }
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }
    static String brwiden(String alg) {
        String[] algarray = alg.split(" ");
        ArrayList<String> centerpos = new ArrayList<String>();
        centerpos.add("U"); centerpos.add("BL"); centerpos.add("BRw"); centerpos.add("FF"); centerpos.add("FR"); centerpos.add("BR"); centerpos.add("BB"); centerpos.add("D");
        String[] faces = {"U", "BL", "FL", "FF", "FR", "BR", "BB", "D"};
        ArrayList<String> finalalg = new ArrayList<String>();
        for (int j=0;j<algarray.length;j++) {
            String suffix = " ";
            if (algarray[j].contains("'")) {
                suffix = "' ";
            }
            if (algarray[j].contains("FL")) {
                Collections.swap(centerpos, 0, 4); Collections.swap(centerpos, 0, 6); Collections.swap(centerpos, 3, 7); Collections.swap(centerpos, 3, 1);
                if (algarray[j].contains("'")) {
                    Collections.swap(centerpos, 0, 4); Collections.swap(centerpos, 0, 6); Collections.swap(centerpos, 3, 7); Collections.swap(centerpos, 3, 1);
                }
            }
            int movenum = 0;
            for (int i=0; i<faces.length;i++){
                if (algarray[j].contains(faces[i])) {
                    movenum = i;
                    break;
                }

            }
            finalalg.add(centerpos.get(movenum) + suffix);
        }
        StringBuilder sb = new StringBuilder();
        for (String s : finalalg) {
            sb.append(s);
        }
        return sb.toString();
    }

}
