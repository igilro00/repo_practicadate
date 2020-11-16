package es.unileon.prg1.date;

public class MainDate {

    public static void main(String[] args) {
        
        Date today = null;

        try {
            today = new Date(15,11,2020);
            System.out.println(today);
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("isSameYear(2019) is: " + today.isSameYear(2019));
        System.out.println("isSameYear2(2020) is: " + today.isSameYear2(2020));
        System.out.println("isSameMonth(10) is: " + today.isSameMonth(10));
        System.out.println("isSameMonth2(11) is: " + today.isSameMonth2(11));
        System.out.println("isSameDay(15) is: " + today.isSameDay(15));
        System.out.println("isSameDay2(14) is: " + today.isSameDay2(14));
        System.out.println("isSame(15,11,2020) is: " + today.isSame(15,11,2020));
        System.out.println("isSameDate2(15,10,2020) is: " + today.isSameDate2(15,10,2020));

        System.out.println("The name of month is: " + today.nameOfMonth(11));

        System.out.println("checkDay(15) is: " + today.checkDay(15));

        System.out.println("The season of month is: " + today.seasonOfMonth(11));

        System.out.println("The months until the end of year are: " + today.monthsToEndOfYear());

        System.out.println("The date is: " + today.toString2());

        System.out.println("The dates until the end of the month are: " + today.allDatesToEndOfMonth());

        System.out.println("The number of months with the same days than this one is: " + today.monthsWithSameDays());

        System.out.println("The number of days since the begining of the year is: " + today.numberOfDaysUntilToday());

        System.out.println("The number of week day is: " + today.dayOfWeek(3));

        System.out.println("THE END");


        /*Los metodos attemptToMatchDate no me dan una solucion en un tiempo razonable y entran en un bucle infinito.
        Por eso no los ejecuto.
        */
        //System.out.println("The number of attempts to match the date randomly is: " + today.attemptToMatchDate());
        //System.out.println("The number of attempts to match the date randomly (second method) is: " + today.attemptToMatchDate2());


    }


}