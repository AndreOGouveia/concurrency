package org.academiadecodigo.bootcamp.concurrency.bqueue;

/**
 * Blocking Queue
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    /**
     * Constructs a new queue with a maximum size
     * @param limit the queue size
     */
    public BQueue(int limit) {

        throw new UnsupportedOperationException();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     * @param data the data to add to the queue
     */
    public void offer(T data) {

        throw new UnsupportedOperationException();

    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */
    public T poll() {

        throw new UnsupportedOperationException();

    }

    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public int getSize() {

        throw new UnsupportedOperationException();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit() {

        throw new UnsupportedOperationException();

    }

}
