package com.noida.learning.threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.IntStream;

public class ConcurrentProcessor implements Processor {
    private static final int THREADS = 4;

    private final LongAccumulator result = new LongAccumulator(Long::sum, 0L);
    private final AtomicInteger position = new AtomicInteger(0);
    private final ExecutorService executor = Executors.newFixedThreadPool(THREADS);

    @Override
    public Integer process(List<Integer> input) throws InterruptedException {
        processArrayConcurrently(input.toArray(new Integer[input.size()]));
        return result.intValue();
    }

    private void processArrayConcurrently(Integer[] array) throws InterruptedException {

        final Runnable runnable = () -> {
            while (position.intValue() < array.length) {
                addElements(array);
            }
        };
        IntStream.rangeClosed(1, THREADS)
                .forEach(threadNumber -> executor.submit(runnable));

        executor.awaitTermination(1, TimeUnit.SECONDS);
    }

    private void addElements(Integer[] array) {
        int current = position.getAndAdd(2);
        final int sum = array[current] + array[current + 1];
        result.accumulate(sum);
    }
}