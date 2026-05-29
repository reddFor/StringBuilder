package org.example.task_4;

import java.util.Queue;

public class BlockingQueue<T> {
    /*
    Практическая задача - Concurrency - блокирующая очередь
    */
    // 1. enq - сует элементы в очередь,
    //    deq - забирает оттуда элементы.
    // 2. Если deq - пустая, то ждем нью элемент,
    //         que - полная, то ждем.
    // 3. Очередь имеет фикс сайз
    // 4. юзаем wait notify
    // 5. юз size()

    private final Queue<T> queue;
    private final int limit;

    public BlockingQueue(Queue<T> queue, int limit) {
        this.queue = queue;
        this.limit = limit;
    }

    public synchronized void enqueue(T el) {
        while (queue.size() == limit) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.add(el);
        notifyAll();
    }

    public synchronized T dequeue() {
        while (queue.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        T element = queue.poll();
        notifyAll();
        return element;
    }

    public int size() {
        return queue.size();
    }
}
