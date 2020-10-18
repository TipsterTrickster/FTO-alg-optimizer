package com.Aedan;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import com.Aedan.translator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("alg: ");
        String firstalg1 = scanner.nextLine();

        String[] firstalgarray = firstalg1.split("zz");
        String[] lastalg = new String[firstalgarray.length];

        for (int j=0;j<firstalgarray.length;j++) {
            lastalg[j] = translator.wide(firstalgarray[j]);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : lastalg) {
            sb.append(s+"zz");
        }
        System.out.println(sb.toString());


        System.out.print("2nd alg: ");
        String alg = scanner.nextLine();

        String[] algarray = alg.split("zz");

        for (int i=0;i<algarray.length;i++) {
            //rotates x
            String x = translator.xrot(algarray[i]);
            //rotate x'
            String xp = translator.xrot(x);
            //rotates y
            String y = translator.yrot(algarray[i]);
            //rotate y'
            String yp = translator.yrot(y);
            //rotate z
            String z = translator.zrot(algarray[i]);
            //rotate z'
            String zp = translator.zrot(z);
            //rotate t
            String t = translator.trot(algarray[i]);
            //rotate xy
            String xy = translator.yrot(x);
            //rotate xy'
            String xyp = translator.yrot(translator.yrot(x));
            //rotate xz
            String xz = translator.zrot(x);
            //rotate xz'
            String xzp = translator.zrot(translator.zrot(x));
            //rotate x'y
            String xpy = translator.yrot(xp);
            //rotate x'z
            String xpz = translator.zrot(xp);
            //rotates tx
            String tx = translator.xrot(t);
            //rotate tx'
            String txp = translator.xrot(translator.xrot(t));
            //rotates ty
            String ty = translator.yrot(t);
            //rotate ty'
            String typ = translator.yrot(translator.yrot(t));
            //rotate tz
            String tz = translator.zrot(t);
            //rotate tz'
            String tzp = translator.zrot(translator.zrot(t));
            //rotate txz
            String txz = translator.zrot(translator.xrot(t));
            //rotate txz'
            String txzp = translator.zrot(translator.zrot(translator.xrot(t)));
            //rotate tx'y
            String txpy = translator.yrot(translator.xrot(translator.xrot(t)));
            //rotate tx'z
            String txpz = translator.zrot(translator.xrot(translator.xrot(t)));
            //rotate t'
            String tp = translator.trot(xy);




            String[] allalgs = {alg, x, xp, y, yp, z, zp, t, tp, xy, xz, xzp, xpy, xpz, tx, txp, ty, typ, tz, tzp, txz, txzp, txpy, txpz};

            //checks moveset that works best with edge in front notation)

            //uncomment this to check for Rws
//            for (int j = 0; j < allalgs.length; j++) {
//                allalgs[j] = translator.widen(allalgs[j]);
//            }
//
//            for (int j = 0; j < allalgs.length; j++) {
//                if (allalgs[j].contains("BB") || allalgs[j].contains("FF") || allalgs[j].contains("BR.") || allalgs[j].contains("FL")) {
//                    continue;
//                } else {
//                    System.out.println(allalgs[j]);
//                }
//            }


            //Checks moveset that works best with Bens notation (corner in front)

            //uncomment this to check for BRws
            for (int j = 0; j < allalgs.length; j++) {
                allalgs[j] = translator.brwiden(allalgs[j]);
            }

            for (int j = 0; j < allalgs.length; j++) {
                if (allalgs[j].contains("BB.") || allalgs[j].contains("FF") || allalgs[j].contains("FR") || allalgs[j].contains("BL")) {
                    continue;
                } else {
                    System.out.println(allalgs[j]);
                }
            }





        }





    }
}
