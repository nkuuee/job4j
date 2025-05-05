package Theme_6;

import org.jetbrains.annotations.NotNull;

import java.util.*;

import static java.util.Arrays.asList;

public class Easy {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        String[] result = res.split(" ");


        for (int j = result.length - 1; j >= 0; j--) {
            //  String smcxm = result[j];
            int sdfjlsdfl = Integer.parseInt(result[j]);
            if (sdfjlsdfl % 2 == 0) {
                System.out.print(sdfjlsdfl + " ");
            }


        }




/*
                if (sdfasdf % 2 == 0) {
в
                    List<Integer> dsff = new ArrayList<>(sdfasdf);


                }

 */


        sc.close();
    }


}


