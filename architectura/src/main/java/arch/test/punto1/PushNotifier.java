package arch.test.punto1;

public class PushNotifier implements Notifier {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("[PUSH] to=" + to + " | title=" + subject + " | body=" + body);
    }
}