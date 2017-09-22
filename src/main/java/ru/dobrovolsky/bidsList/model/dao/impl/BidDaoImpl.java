package ru.dobrovolsky.bidsList.model.dao.impl;

import ru.dobrovolsky.bidsList.model.Bid;
import ru.dobrovolsky.bidsList.model.dao.BidDao;

import java.util.ArrayList;
import java.util.List;

public class BidDaoImpl implements BidDao {

    private static List<Bid> bids = new ArrayList<>(255);

    static {
        for (int i = 0; i < 255; i++) {
            bids.add(new Bid("Package: " + i));
        }
    }

    @Override
    public void add(Bid bid) {
        bids.add(bid);
//        emf.persist(bid);
    }

    @Override
    public void update(Bid bid) {
        for (Bid bid1 : bids) {
            if (bid1.getId() == bid.getId()) {

            }
        }
        int index = bids.indexOf(bid);
        if (index != -1) {
            bids.add(index, bid);
        }
//        emf.merge(bid);
    }

    @Override
    public Bid delete(Bid bid) {
        bids.remove(bid);
//        emf.remove(emf.getReference(Bid.class, bid.getId()));
        return bid;
    }

    @Override
    public List<Bid> getBids(String search) {
        return bids;
//        if (null == search || search.trim().isEmpty()) {
//            return emf.createQuery(
//                    "select c from Car c")
//                    .getResultList();
//        }
//        int id = Integer.parseInt(search);
//        return emf.createQuery(
//                "select c from Car c where c.id = :id")
//                .setParameter("search", search.trim() + "%")
//                .setParameter("id", id)
//                .getResultList();
    }

    @Override
    public Bid findById(int id) {
        for (Bid bid : bids) {
            if (bid.getId() == id) {
                return bid;
            }
        }
        return null;
//        return (Bid) emf.createQuery(
//                "select c from Car c where c.id = :id")
//                .setParameter("search", search.trim() + "%")
//                .setParameter("id", id)
//                .getSingleResult();
    }
}
