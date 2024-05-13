package Dateien;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


public class date {

    public static void main(String[] args) {

        //int tag = 10, monat = 1, jahr = 2000;
        Date datum1 = new Date();
        // Monat beginnt bei 0, Jahr bei 1900
        Date datum2 = new Date(2024 - 1900, 4, 7, 11, 45, 30);
        System.out.println(datum2);

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy H:m:ss");
        System.out.println( df.format(datum2) );

        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println( df2.format(datum2) );

        GregorianCalendar gc1 = new GregorianCalendar();
        System.out.println(gc1);
        System.out.println(gc1.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc1.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.getDefault()));

        System.out.println(gc1.get(Calendar.MONTH));
        System.out.println(gc1.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT, Locale.getDefault()));


        GregorianCalendar gc2 = new GregorianCalendar(2024, 4, 11, 12, 56, 0);
        System.out.println(gc2.get(Calendar.DAY_OF_WEEK));
        System.out.println(gc2.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, Locale.getDefault()));

        System.out.println( df.format(gc2.getTime()) );


    }

}
