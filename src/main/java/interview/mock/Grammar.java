package interview.mock;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.ZoneOffset.UTC;

public class Grammar {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = Instant.now().atZone(UTC).truncatedTo(ChronoUnit.DAYS);

        Clock clock = Clock.systemDefaultZone();


        ZonedDateTime zonedDateTime1 = clock.instant().atZone(UTC).truncatedTo(ChronoUnit.DAYS);

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime.equals(zonedDateTime1));

        LocalDate.now(clock);

        System.out.println(ZoneId.systemDefault());

        Clock system = Clock.system(ZoneId.of("Africa/Bissau"));
        System.out.println(system.getZone());
        System.out.println(system.instant());
        System.out.println(Instant.now().atZone(UTC).toInstant());

        System.out.println(Instant.now().minus(6, ChronoUnit.HOURS).atZone(ZoneId.of("America/Chicago")).toLocalDate());

        System.out.println(Instant.now().minus(6, ChronoUnit.HOURS).atZone(ZoneId.of("Europe/Kiev")).toLocalDate());
        System.out.println(LocalDate.now(Clock.fixed(Instant.now().minus(6, ChronoUnit.HOURS), ZoneId.of("America/Chicago"))));

        System.out.println(Instant.now().minus(6, ChronoUnit.HOURS).atZone(ZoneId.of("Europe/Kiev")).toInstant().atZone(UTC).truncatedTo(ChronoUnit.DAYS));
        System.out.println(Clock.fixed(Instant.now().minus(6, ChronoUnit.HOURS), ZoneId.of("America/Chicago")).instant().atZone(UTC).truncatedTo(ChronoUnit.DAYS));



    }

}
