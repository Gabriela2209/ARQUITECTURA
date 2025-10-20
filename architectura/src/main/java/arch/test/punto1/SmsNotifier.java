package arch.test.punto1;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("[SMS] to=" + to + " | msg=" + body);
    }
}