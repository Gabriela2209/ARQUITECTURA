package arch.test.punto1;

public class PushNotificationService extends NotificationService {
    @Override
    protected Notifier createNotifier() {
        return new PushNotifier();
    }
}