package ru.dobrovolsky.bidsList.controllers;

import ru.dobrovolsky.bidsList.model.Bid;

public class ExtResult {
    private boolean success;
    private Bid data;


    public ExtResult(boolean success, Bid data) {
        this.success = success;
        this.data = data;
    }

    public ExtResult() {
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Bid getData() {
        return data;
    }

    public void setData(Bid data) {
        this.data = data;
    }
}
