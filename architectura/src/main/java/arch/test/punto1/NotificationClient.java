package arch.test.punto1;

public class NotificationClient {
    public void process(NotificationService service) {
        service.notify("student@school.edu", "Recordatorio de préstamo", "Tu libro vence mañana");
    }
}