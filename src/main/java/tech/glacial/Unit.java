package tech.glacial;

import tech.glacial.util.IndexOutOfBoundsException;

/**
 * {@code Unit} is
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Unit extends Tuple {

    private static final Unit Instance = new Unit();

    public static Unit instance() {
        return Instance;
    }

    private Unit() {
    }

    public int productArity() {
        return 0;
    }

    public Object productElement(int n) {
        throw new IndexOutOfBoundsException(Integer.toString(n));
    }

    public String toString() {
        return "()";
    }
}