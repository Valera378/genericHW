package org.itstep.step03;

import org.itstep.step02.Pair;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итерируемая коллекция объектов Pair.
 *
 * @author Michael S. Kirkpatrick and Nathan Sprague
 * @version V1, 8/2017
 */
public class Pairs<K, V> implements Iterable<Pair<K, V>> {


    /* TODO: Объявить массив фиксированного размера (максимум 10 элементов) объектов Pair */
    private int count = 0;
    private  Pair<K, V>[] pairs;


    /**
     * Создайте коллекцию, в которой будут храниться элементы, добавленные парами.
     */

    @SuppressWarnings("unchecked")
    public Pairs() {
        pairs = new Pair[10];
    }

    /**
     * TODO: Создайте новую пару и добавьте ее в коллекцию, если есть место.
     *  @param first  Первый объект
     *
     * @param second Второй объект
     * @return
     */
    public boolean addPair(K first, V second) {
        if (count < 10) {
            pairs[count] = new Pair<>(first, second);
            count++;
            return true;
        }
        return false;
    }
    @Override
    public Iterator<Pair<K, V>> iterator() {

        return new PairIterator();
    }

    /*
     * TODO: Реализуйте итератор здесь на основе документации API по адресу
     * https://docs.oracle.com/javase/10/docs/api/java/util/Iterator.html Throw the exceptions as
     * specified
     */
    private class PairIterator implements Iterator<Pair<K, V>> {
         int i;
       // boolean invokedHasNext ;
        boolean calledNext;

        /**
         * TODO: Проверить наличие следующего элемента в итераторе
         */

        @Override
        public boolean hasNext() {
          //  invokedHasNext = true;
            return i < count;
        }
        /**
         * TODO: Вернуть следующую пару в итератор.
         *
         * @throws NoSuchElementException - если больше нет элементов для итерации
         */

        @Override
        public Pair<K, V> next() {
            calledNext = true;
            if (i >= count) {
                throw new NoSuchElementException();
            }
            return pairs[i++];
        }

        /**
         * TODO: Удалите предыдущую пару, возвращенную функцией next()
         */

        @Override

        public void remove() {
            if(!calledNext){
                throw new IllegalStateException();
            }
            for (int j = i ; j < count; j++) {
                pairs[j - 1] = pairs[j];
            }
            count--;
            calledNext = false;
           // invokedHasNext = false;

        }
    }
}

