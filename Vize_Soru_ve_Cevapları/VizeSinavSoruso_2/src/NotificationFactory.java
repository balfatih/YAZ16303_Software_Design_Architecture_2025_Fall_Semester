public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL"))
            return new EmailNotification();
        else if (type.equalsIgnoreCase("SMS"))
            return new SMSNotification();
        else if (type.equalsIgnoreCase("PUSH"))
            return new PushNotification();
        else
            throw new IllegalArgumentException("Geçersiz bildirim türü: " + type);
    }
}
