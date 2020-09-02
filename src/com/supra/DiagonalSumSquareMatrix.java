package com.supra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DiagonalSumSquareMatrix {

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> diagonal1 = new ArrayList<>();
        List<Integer> diagonal2 = new ArrayList<>();
        for(int i = 0; i<arr.size(); i++) {
            for(int j=0; j< arr.get(i).size(); j++) {
                if(i==j) {
                    diagonal1.add(arr.get(i).get(j));
                }
                if ((i+j) == arr.get(i).size()-1){
                    diagonal2.add(arr.get(i).get(j));
                }
            }
        }
        int total1 = diagonal1.stream().reduce(0, Integer::sum);
        int total2 = diagonal2.stream().reduce(0, Integer::sum);
        int sum = Math.abs(total1 - total2);
        return sum;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        System.out.println(diagonalDifference(arr));
        bufferedReader.close();
    }
}
