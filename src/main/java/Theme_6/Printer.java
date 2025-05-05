package Theme_6;

public class Printer <T> {
    T thingToPrinter;

    public Printer(T thingToPrinter) {
        this.thingToPrinter = thingToPrinter;
    }

    public void print() {
        System.out.println(thingToPrinter);
    }

    public static void main(String[] args) {
        Printer<Integer> one = new Printer<>(90);
        Printer<String> two = new Printer<>("Moscow");
        Printer<Double> three = new Printer<>(33.5);

        one.print();
        two.print();
        three.print();
    }
}