package pl.kszafran.sda.algo.exercises;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Zaimplementuj poniższe metody operujące na liście pojedynczo wiązanej.
 *
 * Uwaga: nie musisz implementować metod w takiej kolejności w jakiej są zadeklarowane.
 */
public class ExercisesXxxLinkedList {

    /**
     * Tworzy nową listę zawierającą podane elementy.
     */
    public <T> LinkedList<T> createList(T... elements) {
        return new LinkedListImpl<>(elements);
    }

    public interface LinkedList<T> extends Iterable<T> {

        /**
         * Zwraca true jeśli lista jest pusta.
         */
        boolean isEmpty();

        /**
         * Zwraca rozmiar listy (ilość elementów).
         */
        int size();

        /**
         * Zwraca pierwszy element listy.
         *
         * @throws NoSuchElementException jeśli lista jest pusta
         */
        T getFirst();

        /**
         * Zwraca ostatni element listy.
         *
         * @throws NoSuchElementException jeśli lista jest pusta
         */
        T getLast();

        /**
         * Pobiera element listy pod podanym indeksem.
         *
         * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
         */
        T get(int index);

        /**
         * Usuwa wszystkie elementy z listy.
         */
        void clear();

        /**
         * Dodaje nowy element na początku listy.
         */
        void addFirst(T element);

        /**
         * Dodaje nowy element na końcu listy.
         */
        void addLast(T element);

        /**
         * Usuwa pierwszy element listy.
         *
         * @throws NoSuchElementException jeśli lista jest pusta
         */
        void removeFirst();

        /**
         * Usuwa ostatni element listy.
         *
         * @throws NoSuchElementException jeśli lista jest pusta
         */
        void removeLast();

        ////////////////////////////////////////////
        //                                        //
        // PONIŻEJ ZADANIA DODATKOWE DLA CHĘTNYCH //
        //                                        //
        ////////////////////////////////////////////

        /**
         * Zwraca iterator po elementach listy.
         *
         * @see java.lang.Iterable
         */
        @Override
        Iterator<T> iterator();

        /**
         * Zamienia element pod podanym indeksem.
         */
        void setAt(int index, T element);

        /**
         * Dodaje nowy element pod wskazanym indeksem.
         *
         * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
         */
        void addAt(int index, T element);

        /**
         * Usuwa element pod wskazanym indeksem.
         *
         * @throws IndexOutOfBoundsException jeśli indeks leży poza zakresem listy
         */
        void removeAt(int index);
    }

    private static class LinkedListImpl<T> implements LinkedList<T> {

        private Node<T> head;

        public LinkedListImpl(T[] elements) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public boolean isEmpty() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public int size() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public T getFirst() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public T getLast() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public T get(int index) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void clear() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void addFirst(T element) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void addLast(T element) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void removeFirst() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void removeLast() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public Iterator<T> iterator() {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void setAt(int index, T element) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void addAt(int index, T element) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        @Override
        public void removeAt(int index) {
            throw new UnsupportedOperationException("Not implemented yet");
        }

        private static class Node<T> {

            private final T element;
            private final Node<T> next;

            private Node(T element, Node<T> next) {
                this.element = element;
                this.next = next;
            }
        }
    }
}