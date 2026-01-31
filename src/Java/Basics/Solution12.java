import java.util.Calendar;

public class Solution12 {
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        
        // Months are 0-based in Calendar (Jan = 0)
        cal.set(year, month - 1, day);

        // Get the day of week
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // Convert to string
        String[] days = {
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "FRIDAY", "SATURDAY"
        };

        return days[dayOfWeek - 1];
    }
}
