import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Yoga {
    private final boolean alive;
    private final int age;
    private final String city;
    private final String[] color;

    public Yoga(boolean alive, int age, String city, String[] color) {
        this.alive = alive;
        this.age = age;
        this.city = city;
        this.color = color;
    }


    public static void main(String[] args) {
        final Yoga json = new Yoga(true, 90, "Moscow", new String[]{
                "blue", "red", "green"});

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






