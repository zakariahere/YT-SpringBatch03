package tech.elzakaria.utils;

import lombok.experimental.UtilityClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

@UtilityClass
public class DateUtils {

    public static final String DATE_FORMAT = "yyyy-MM-dd";


    /**
     * Prend la date en string, parse pour date
     * @param pDateToParse date en string
     * @return Date util
     * @throws ParseException exception
     */
    public static Date getDateFromString(final String pDateToParse) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        return dateFormat.parse(pDateToParse);
    }


    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("IDF" + i +";nom"+ i + ";prenom" + i + ";1991-02-" +  ThreadLocalRandom.current().nextInt(1, 29));
        }

    }
}
