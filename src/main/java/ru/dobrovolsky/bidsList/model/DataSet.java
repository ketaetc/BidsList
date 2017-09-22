package ru.dobrovolsky.bidsList.model;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class DataSet implements Serializable {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;

    public DataSet() {
        this.id = count.incrementAndGet();
    }

    public int getId() {
        return id;
    }
}
