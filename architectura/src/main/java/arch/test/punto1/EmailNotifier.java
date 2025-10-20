package arch.test.punto1;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("[EMAIL] to=" + to + " | subject=" + subject + " | body=" + body);
    }
}