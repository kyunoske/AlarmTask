public class AlarmTwo {

    public static void main(String[] args) {
        String color = "pink";

        System.out.println(alarm(color));
    }


    public static String alarm(String value) {

        switch (value) {
            case "red":
                return "keine Personen erlaubt";

            case "yellow":
                return "max 30 Personen erlaubt";

            default:
                return "max 60 Personen erlaubt";
        }
    }
}
