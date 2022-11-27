package tn.esprit.nesrineprojet1.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

public class HelperClass {
    public static long computeDifferenceBetweenDateInDays(Date dateDebut , Date dateFin) {

        long differenceInDays = ChronoUnit.DAYS.between((Temporal) dateDebut,(Temporal) dateFin);

        return differenceInDays ;

    }

}
