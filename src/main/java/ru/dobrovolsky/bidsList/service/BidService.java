/*
 * (c) КАЦИТ, 2013. Все права защищены.
 */
package ru.dobrovolsky.bidsList.service;

import ru.dobrovolsky.bidsList.model.Bid;

import java.util.List;

public interface BidService {

    Boolean add(Bid bid);

    void update(Bid bid);

    List<Bid> getBids(String id);

    Bid delete(Bid bid);

    Bid findById(int id);

}
