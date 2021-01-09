package com.noida.learning.ds.hackerrank;

import java.util.Arrays;

/**
 * Hackerland is a one-dimensional city with houses aligned at integral locations along a road.
 * The Mayor wants to install radio transmitters on the roofs of the city's houses.
 * Each transmitter has a fixed range meaning it can transmit a signal to all
 * houses within that number of units distance away.
 * Given a map of Hackerland and the transmission range, determine the minimum number of transmitters so that every house is
 * within range of at least one transmitter.
 * Each transmitter must be installed on top of an existing house.
 * <p>
 * For example, assume houses are located at x=[1,2,3,5,9]  and the transmission range k=1.
 * 3 antennae at houses 2 and 5 and 9 would provide complete coverage.
 * There is no house 7 at location  to cover  both 5  and 9 . Ranges of coverage, are ,[1,2,3],[5] and  [9].
 */
public class HackerlandRadioTransmitter {
  //0 = 2
  //1 = 4
  //2 = 5
  //3 = 6
  //4 = 7
  //5 = 9
  //6 = 11
  //7 = 12
    static int hackerlandRadioTransmitters(int[] x, int k) {
        Arrays.sort(x);
        int i = 0;
        int n = x.length;
        int noOfTransmitters = 0;
        while (i < n) {
            ++noOfTransmitters;
            int startRange = x[i] + k;
            while (i < n && x[i] <= startRange) {
                i++;
            }
            --i;
            int endRange = x[i] + k;
            while (i < n && x[i] <= endRange) {
                i++;
            }
        }
        return noOfTransmitters;
    }

    public static void main(String[] args) {
        int input[] = { 7, 2, 4, 6, 5, 9, 12, 11 };
        System.out.println(hackerlandRadioTransmitters(input, 2));
    }

}

