package ru.dobrovolsky.bidsList.model.dao;

import ru.dobrovolsky.bidsList.model.Bid;

import java.util.List;

public interface BidDao {

    void add(Bid bid);

    void update(Bid bid);

    Bid delete(Bid bid);

    List<Bid> getBids(String search);

    Bid findById(int id);

}
