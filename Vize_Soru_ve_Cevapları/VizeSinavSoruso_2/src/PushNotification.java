public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("🔔 Mobil bildirim gönderildi: " + message);
    }
}
