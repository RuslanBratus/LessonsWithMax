package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final String path = "C:\\Users\\ryla2\\Desktop\\Programs\\myWorkingText.txt";

    public static void main(String[] args) throws IOException {
        String [][] arr = {
                {"bobes","one"},
                {"jac","two"},
                {"adam","three"}
        };

        System.out.println(Arrays.deepToString(arr));

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {

                return o1[0].compareTo(o2[0]);
            }
        });

        System.out.println("result = " + Arrays.deepToString(arr));

    }


}