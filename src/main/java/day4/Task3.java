package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrixs = new int[12][8];
        int lastMaxSumm = 0;
        int currentMaxSumm = 0;
        int maxLineSumm = 0;

        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[i].length; j++) {
                int randomNumber = (int) Math.ceil(Math.random() * 50);
                matrixs[i][j] = randomNumber;
            }
        }

        for (int i = 0; i < matrixs.length; i++) {
            for (int j = 0; j < matrixs[i].length; j++) {
                currentMaxSumm += matrixs[i][j];
            }
            if (currentMaxSumm >= lastMaxSumm){
                lastMaxSumm = currentMaxSumm;
                maxLineSumm = i;
            }
            currentMaxSumm = 0;
        }
        System.out.println(maxLineSumm);
    }
}
