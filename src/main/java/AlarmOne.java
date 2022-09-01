public class AlarmOne {

    public static void main(String[] args) {
        int number =  30;

        System.out.println(alarm(number));
    }
    public static String alarm(int number) {
        if (number > 30) {
            return "Zu viele Personen zurück";
        } else if (number == 30) {
            return "You're right in the middle!";
        } else {
            return "Maximale Personenzahl nicht überschritten";
        }
    }
}
