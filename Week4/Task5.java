import java.util.*;

public class Task5 {

    public static String timeConversion(String s) {
        // Extract hour, minutes, seconds, and AM/PM
        String period = s.substring(8); // AM or PM
        int hour = Integer.parseInt(s.substring(0, 2));
        String minutesSeconds = s.substring(2, 8);

        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0; // 12AM -> 00
            }
        } else { // PM
            if (hour != 12) {
                hour += 12; // Add 12 for PM except 12PM
            }
        }

        // Format hour to always have 2 digits
        return String.format("%02d", hour) + minutesSeconds;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(timeConversion(s));

        sc.close();
    }
}