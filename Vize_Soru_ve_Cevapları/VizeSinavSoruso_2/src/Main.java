//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        System.out.println("\n");
        Notification n1 = factory.createNotification("EMAIL");
        n1.send("Ders tarihinde değişiklik olmuştur. Dersimiz 14 Kasım 2025 tarihinde yapılacaktır.");

        Notification n2 = factory.createNotification("SMS");
        n2.send("Ders tarihinde değişiklik olmuştur. Dersimiz 14 Kasım 2025 tarihinde yapılacaktır.");

        Notification n3 = factory.createNotification("PUSH");
        n3.send("Ders tarihinde değişiklik olmuştur. Dersimiz 14 Kasım 2025 tarihinde yapılacaktır.");

    }
}