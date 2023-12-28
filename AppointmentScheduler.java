import java.time.*;
import java.time.format.*;
import java.util.*;

class AppointmentScheduler {
    // retorna uma data formtada para 06/21/2023 18:34:44
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy kk:mm:ss");
        return  LocalDateTime.parse(appointmentDateDescription, formatter); 
    }
    // informa se uma data é anterior a hoje
    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }
    // informa se um horário é durante a tarde
    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18 ? true : false;   
    }
    // retorna uma mensagem formatada da data
    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.ENGLISH);
        return "You have an appointment on ".concat(appointmentDate.format(formatter));
    }
    // informa a data do seu aniversário no ano corrente
    public LocalDate getAnniversaryDate() {
        return LocalDate.of(1980, 9, 15).withYear(LocalDate.now().getYear());
    }
}
