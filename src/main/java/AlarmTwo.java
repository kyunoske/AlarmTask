public class AlarmTwo {

    public static void main(String[] args) {
        String color = "red";

        switch (alarm(color)) {
            case "red":
                System.out.println("keine Personen erlaubt");
                break;
            case "yellow":
                System.out.println("max 30 Personen erlaubt");
                break;
            default:
                System.out.println("max 60 Personen erlaubt");
        }
    }


    public static String alarm(String value) {
        return value;
    }
}
