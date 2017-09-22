package ru.dobrovolsky.bidsList.model;

import java.util.Random;

public class Bid extends DataSet {

    private static Random random = new Random();

//    private int id;

    private String name;

    public Bid(/*int id*/) {
        super();

////        this.id = random.nextInt(1000);
//        this.id = id;
//
        this.name = "name:" + random.nextInt();
    }

    public Bid(/*int id, */String name/*, Parameter addressTo, Parameter addressFrom, Parameter status*/) {
        super();
//        this.id = id;

        this.name = name;
//        this.addressTo = addressTo;
//        this.addressFrom = addressFrom;
//        this.status = status;
    }

    public String getName() {
        return name;
    }

//    public int getId() {
//        return id;
//    }

//
//    @Override
//    public int getId() {
//        return id;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setId(int id) {
//        this.id = id;
//    }


//    public void setId(int id) {
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Bid {id = " + getId() + "; name = " + name + /*"; addressTo = " + addressTo + "; addressFrom = "
                + addressFrom + "; status = " + status + */"}";
    }
}
