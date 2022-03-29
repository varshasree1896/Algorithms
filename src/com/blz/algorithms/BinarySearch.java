package com.blz.algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

import java.util.Scanner;
import java.util.StringTokenizer;

    public class BinarySearch<T extends Comparable<T>> {
        /**
         * PERFORMS BINARY SEARCH
         *
         * @param arr              to get the array or strings
         * @param searched_element to search in array
         */
        public int binarySearch(T[] arr, T searched_element) {
            int left_Index = 0, right_Index = arr.length - 1;
            while (left_Index < right_Index) {
                int middle_Index = left_Index + (right_Index - left_Index) / 2;
                int res = searched_element.compareTo(arr[middle_Index]);
                if (res == 0)
                    return middle_Index;
                if (res > 0) {
                    left_Index = middle_Index + 1;
                }
                if (res < 0) {
                    right_Index = middle_Index - 1;
                }

            }
            return -1;
        }

        public static void main(String[] args) throws IOException {
            Reader file = new FileReader("E:\\Day16AlgorithmsRpf77\\src\\com\\bridgelabz\\txtfiles\\words.txt");
            Scanner sc = new Scanner(file);
//        String st ="";
            String st[] = new String[11];
            String words[] = new String[st.length];
            while (sc.hasNextLine()) {

                st = sc.nextLine().split(" ");
                for (int i = 0; i < st.length; i++) {

                    words[i] = st[i];
                }
            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the element to search");
            String input = scan.next();
            Arrays.sort(words);
            BinarySearch<String> search = new BinarySearch<>();
            int result = search.binarySearch(words, input);
            if (result == -1)
                System.out.println("Element not present");
            else {
                System.out.println("Element found at "
                        + "index " + result);
            }


    }

}
