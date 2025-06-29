package Q6;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Date;

public class SecondPart {
    public static void main(String[] args) {
        ZonedDateTime india=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime usTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime londonTime=ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println("Current Time of India: "+india);
        System.out.println("Current Time of US: "+usTime);
        System.out.println("Current Time of London: "+londonTime);

    }
}
