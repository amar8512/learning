package com.noida.learning;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.stream.Collectors;

public class Infinite {

    public static String getTimeZoneUsingOffset(String offset){

         int hours = Integer.valueOf(offset.substring(0,offset.indexOf('.')));
        OffsetDateTime odt = OffsetDateTime.now ( ZoneId.systemDefault () );
        ZoneOffset zoneOffset = odt.getOffset ();

        final List<ZoneId> timeZoneByUtc = ZoneId.getAvailableZoneIds().stream().map(ZoneId::of)
                .filter(z -> z.getRules().getOffset(Instant.now()).equals(ZoneOffset.ofHours(hours)))
                .collect(Collectors.toList());

        return timeZoneByUtc.get(0).toString();

    }
    public static void main(String[] args) {
      /*  while(true){
            System.out.println("HI");
        }*/
      String offset="-7:00";
      int x=00;
        String previousOffset = String.valueOf(Double.valueOf(offset.replace("+","").
                replace(":","."))-3);
        String afterOffset = String.valueOf(Double.valueOf(offset.replace("+","").
                replace(":","."))+3);
      String timezone=getTimeZoneUsingOffset(previousOffset);
      String timeZoneafter= getTimeZoneUsingOffset(afterOffset);
        System.out.println("Before "+timezone+" "+timeZoneafter);
        System.out.println(timezone);
    /*  int hours = Integer.valueOf(offset.substring(0,offset.indexOf('.')));
      int minutes = Integer.valueOf(offset.substring(offset.indexOf('.')+1,offset.length()));*/
        /*System.out.println("Hours : "+hours+" Minute "+minutes);*/
    }

}
