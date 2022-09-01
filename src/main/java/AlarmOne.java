public class AlarmOne {

    public static void main(String[] args) {
        if (alarm(25) > 30) {
            System.out.println("Zu viele Personen zurück");
        } else {
            System.out.println("Maximale Personenzahl nicht überschritten");
        }
    }
    public static int alarm(int number) {
        return number;
    }
}
