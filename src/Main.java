import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] tableNames = {"Standard", "Family", "Couple"};
        //DaysOfWeek day = DaysOfWeek.FRIDAY;
        String[] time = {"09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00"};
        boolean[][][] reservation = new boolean[tableNames.length][DaysOfWeek.values().length][time.length];
        Scanner input = new Scanner(System.in);

        int table;
        int dayInput;
        int timeInput ;
        reservation[1][3][6]= true;
        do {
            for (int i = 0; i < tableNames.length; i++) {
                System.out.println(i + 1 + ":" + tableNames[i]);
            }
            System.out.println("Please choose a table(1 - " + tableNames.length + ") :");
            table = input.nextInt();

            for (DaysOfWeek days : DaysOfWeek.values()) {
                System.out.println(days.ordinal() + 1 + ":" + days);
            }
            System.out.println("Please choose a day(1 - " + DaysOfWeek.values().length + ") :");
            dayInput = input.nextInt();

            for (int i = 0; i < time.length; i++) {
                System.out.println(i + 1 + ") " + time[i]);
            }
            System.out.println("Please choose the time (1-" + time.length + "): ");
            timeInput = input.nextInt();


            //System.out.println(reservation[table-1][dayInput-1][timeInput-1]? "Reserved" : "Free");
            if (reservation[table - 1][dayInput - 1][timeInput - 1]) {
                System.out.println("Table already taken");
            }
        } while (reservation[table - 1][dayInput - 1][timeInput - 1]);


        reservation[table - 1][dayInput - 1][timeInput - 1] = true;
        System.out.println("Table reserved for " + DaysOfWeek.values()[dayInput] + ", " + time[timeInput - 1] + " o`clock");


    }
}