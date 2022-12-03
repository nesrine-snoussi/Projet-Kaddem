package tn.esprit.nesrineprojet1.utils;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class HelperClass {
    public static long computeDifferenceBetweenDateInDays(Date dateDebut , Date dateFin) {

        long differenceInDays = ChronoUnit.DAYS.between((Temporal) dateDebut,(Temporal) dateFin);

        return differenceInDays ;

    }

    public static long DiffTwoDate(Date dateDebut , Date dateFin){
       /* SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("06/24/2017");
        Date secondDate = sdf.parse("06/30/2017");*/

       /* long diffInMillies = Math.abs(dateFin.getTime() - dateDebut.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        //assertEquals(6, diff);
        return diffInMillies;*/
        long timeDiff=Math.abs(dateFin.getTime()-dateDebut.getTime());
        Long daysDiff= TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
        return daysDiff;
    }

}
