package Theme_6;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class Pair<I, S> {
    private I getFirst;
    private S getSecond;

    public void setGetFirst(I getFirst) {this.getFirst = getFirst;}
    public I getFirst(){return getFirst;}


    public void setGetSecond(S getSecond){this.getSecond = getSecond;}
    public S getSecond(){return getSecond;}

    Pair<Integer, String> pair = Pair.of(1, "hello");

    @Contract(pure = true)
    private static @Nullable Pair<Integer, String> of(int i, String hello) {return null;}

    @Contract(pure = true)
    private static @Nullable Pair<Integer,String> of (boolean mustBeTrue, boolean mustAlsoBeTrue){return null;}

    Integer i = pair.getFirst(); // 1
    String s = pair.getSecond(); // "hello"

    Pair<Integer, String> pair2 = Pair.of(1, "hello");
    boolean mustBeTrue = pair.equals(pair2); // true!
    boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); //true

    public static void main(String[] args) {


    }

}