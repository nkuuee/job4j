import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.*;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

@XmlRootElement(name = "Yoga")
@XmlAccessorType(XmlAccessType.FIELD)
public class Yoga {

    @XmlAttribute
    private boolean alive;
    private int age;
    private String city;
    private String[] color;
    private Yoga_1 yoga1;

    public Yoga() {
    }

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


    @XmlRootElement(name = "Yoga_1")
    public static class Yoga_1 {

        @XmlAttribute
        private String areyouAProgrammer;

        public Yoga_1() {
        }

        public Yoga_1(String areyouAProgrammer) {
            this.areyouAProgrammer = areyouAProgrammer;
        }

        @Override
        public String toString() {
            return "Yoga_1{" +
                    "areyouAProgrammer='" + areyouAProgrammer + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) throws Exception {
        final Yoga yoga = new Yoga(true, 90, "Moscow", new String[]{
                "blue", "red", "green"}, new Yoga_1("sdf"));

        JAXBContext context = JAXBContext.newInstance(Yoga.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        String xml = "";

        try (StringWriter writer = new StringWriter()) {
            marshaller.marshal(yoga, writer);
            xml = writer.getBuffer().toString();
            System.out.println(xml);
        }

        Unmarshaller unmarshaller = context.createUnmarshaller();
        try (StringReader reader = new StringReader(xml)) {

            Yoga result = (Yoga) unmarshaller.unmarshal(reader);
            System.out.println(result);
        }

        /*
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

         */
    }
}








