import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Yoga {
    private final boolean alive;
    private final int age;
    private final String city;
    private final String[] color;
    private final Yoga_1 yoga1;

    public Yoga(boolean alive, int age, String city, String[] color, Yoga_1 yoga1) {
        this.alive = alive;
        this.age = age;
        this.city = city;
        this.color = color;
        this.yoga1 = yoga1;
    }

    @Override
    public String toString() {
        return "Yoga{" +
                "alive=" + alive +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", color=" + java.util.Arrays.toString(color) +
                ", yoga1=" + yoga1 +
                '}';
    }


    public static class Yoga_1 {
        private final String areyouAProgrammer;

        public Yoga_1(String areyouAProgrammer) {
            this.areyouAProgrammer = areyouAProgrammer;
        }
    }

    public static void main(String[] args) {
        final Yoga json = new Yoga(true, 90, "Moscow", new String[]{
                "blue", "red", "green"}, new Yoga_1("sdf"));

        final Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(json));

        final String yogaJSON = "{"
                + "\"alive\":true,"
                + "\"age\":70,"
                + "\"city\":\"Taldom\","
                + "\"color\":[\"Blue\"]"
                + "}";

        final Yoga personMod = gson.fromJson(yogaJSON, Yoga.class);
        System.out.println(personMod);
    }
}








