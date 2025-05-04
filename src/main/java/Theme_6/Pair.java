package Theme_6;

import java.util.Objects;

public class Pair<I, S> {
    private final I first;
    private final S second;

    private Pair(I first, S second) {
        this.first = first;
        this.second = second;
    }

    public static <I, S> Pair<I, S> of(I first, S second) {
        return new Pair<>(first, second);
    }

    public I getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public boolean equals(Object o) {
        if (this == o) return true; // Это значит, что o == o
        if (null == o) return false;
        Pair<?, ?> other = (Pair<?, ?>) o; // ClassCastException при использовании <I, S>
        return Objects.equals(this.first, other.first) && Objects.equals(this.second, other.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first,second);
    }


    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!

        sb.append(i).append(" " + s).append(" " + mustBeTrue).append(" " + mustAlsoBeTrue);
        System.out.println(sb);

    }

}