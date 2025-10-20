package arch.test.punto1;

public abstract class NotificationService {
    public void notify(String to, String subject, String body) {
        Notifier notifier = createNotifier();
        notifier.send(to, subject, body);
    }

    protected abstract Notifier createNotifier();
}