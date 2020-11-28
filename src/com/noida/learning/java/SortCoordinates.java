package com.noida.learning.java;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortCoordinates {
    static class Coordinates {
        private int x;
        private int y;

        Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override public String toString() {
            return "" + x + " "+""+y;
        }
    }

    public static List<Coordinates> sortCoordinates(List<Coordinates> list) {

        if (list != null) {
            Collections.sort(list, ((Coordinates o1, Coordinates o2) -> {
                int result = Integer.compare((int) o1.x, (int) o2.x);
                if (result == 0) {
                    result = -1 * Integer.compare((int) o1.y, (int) o2.y);
                }
                return result;
            }));
        }
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        List<Coordinates> coordinates = new ArrayList<Coordinates>();
        while (input > 0) {
            String inputLine[] = br.readLine().split(" ");
            int x = Integer.parseInt(inputLine[0]);
            int y = Integer.parseInt(inputLine[1]);
            coordinates.add(new Coordinates(x, y));
            --input;
        }
        coordinates = sortCoordinates(coordinates);
        System.out.println(coordinates.toString());
    }
}
