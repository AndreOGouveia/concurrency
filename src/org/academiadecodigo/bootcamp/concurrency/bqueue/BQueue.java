package org.academiadecodigo.bootcamp.concurrency.bqueue;


import java.util.ArrayList;


/**
 * Blocking Queue
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {

    private ArrayList<T> queue;
    private final int limit;

    /**
     * Constructs a new queue with a maximum size
     * @param limit the queue size
     */
    public BQueue(int limit) {
        this.limit = limit;
        queue = new ArrayList<>();
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     * @param data the data to add to the queue
     */
    public void offer(T data) throws InterruptedException {

        synchronized (this){

            while (getSize() == getLimit()) {
                System.out.println(Thread.currentThread().getName()+ " reports Queue is full");
                wait();
            }

            queue.add(0, data);
            notifyAll();
            System.out.println(Thread.currentThread().getName() + " offers " + data.toString() +" and Queue size is " + getSize());
        }
    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */
    public T poll() throws InterruptedException {

        synchronized(this){

            while(getSize() == 0){
                System.out.println(Thread.currentThread().getName()+" reports Queue is empty");
                wait();
            }

            T element = queue.remove(getSize()-1);

            notifyAll();

            System.out.println(Thread.currentThread().getName()+" polls " + element.toString()+" and Queue size is " + getSize());

            return element;
        }
    }

    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public  int getSize() {
        synchronized (this) {
            return queue.size();
        }

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit() {
        return this.limit;
    }

}
