package com.noida.learning.java;

import java.util.Date;

public class DateTimeDemo {
    public static void main(String[] args) {
        String AAM_DestinationId_declared ="67360";
        String AAM_DataSourceId="152756";
      String audience_File_Name = "S3_" + AAM_DestinationId_declared + "_"
                      + AAM_DataSourceId + "_full_" + new Date().getTime() + ".sync";
        System.out.println(""+audience_File_Name);
    }
}
