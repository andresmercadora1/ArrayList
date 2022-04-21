package co.com.cesde;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner inputData = new Scanner(System.in);
        ArrayList<Integer> data = new ArrayList<>();

        /*System.out.println("Digite un valor numerico");
        data.add(inputData.nextInt());*/
        data.add(8);
        data.add(1, 9);
        data.add(2);

        data.add(3, 7);
       /* System.out.println("Valor del array en la " + 3 + " = " + data.get(3));*/
        data.set(3, 12);

        for (int dat : data) {
            System.out.println(dat);
        }



    }
}
