import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    
    LocalDateTime localDateTime;

    final long gigasecond = 1000000000;
    
    public Gigasecond(LocalDate moment) {
        localDateTime = moment.atTime(0,0,0);
    }

    public Gigasecond(LocalDateTime moment) {
        localDateTime = LocalDateTime.from(moment);
    }

    public LocalDateTime getDateTime() {
        return localDateTime.plusSeconds(gigasecond);
    }
}
