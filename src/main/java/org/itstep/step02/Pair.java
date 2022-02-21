package org.itstep.step02;

// TODO: Реализуйте здесь обобщенный класс Pari
public class Pair<F,S> {

    private final F first;
    private final S second;

    /**
     * Создаем объект ObjectTuple на базе двух объектов.
     *
     * @param first первый объект
     * @param second второй объект
     */
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "<" + first.toString() + ", " + second.toString() + ">";
    }

}
