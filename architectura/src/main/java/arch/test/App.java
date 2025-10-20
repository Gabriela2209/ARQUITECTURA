package arch.test;
import arch.test.punto1.EmailNotificationService;
import arch.test.punto1.NotificationClient;
import arch.test.punto1.PushNotificationService;
import arch.test.punto1.SmsNotificationService;
import arch.test.punto2.CsvExporter;
import arch.test.punto2.DocumentExporter;
import arch.test.punto2.PdfExporter;
public class App {
    public static void main(String[] args) {
        System.out.println("==== Factory Method — Ejercicio 1 (Notificaciones) ====");
        NotificationClient client = new NotificationClient();
        client.process(new EmailNotificationService());
        client.process(new SmsNotificationService());
        client.process(new PushNotificationService());

        System.out.println("\n==== Factory Method — Ejercicio 2 (Exportadores) ====");
        DocumentExporter pdf = new PdfExporter();
        DocumentExporter csv = new CsvExporter();
        pdf.export();
        csv.export();
    }
}