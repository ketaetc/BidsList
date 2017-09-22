package ru.dobrovolsky.bidsList.service.impl;

import ru.dobrovolsky.bidsList.model.Bid;
import ru.dobrovolsky.bidsList.model.dao.BidDao;
import ru.dobrovolsky.bidsList.service.BidService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class BidServiceImpl implements BidService {

    private BidDao bidDao;

    public BidDao getBidDao() {
        return bidDao;
    }

    public void setBidDao(BidDao bidDao) {
        this.bidDao = bidDao;
    }

    @Override
    public Boolean add(Bid bid) {
        Bid duplicate = bidDao.findById(bid.getId());
        if (Objects.isNull(duplicate)) {
            bidDao.add(bid);
            return true;
        } else {
            bidDao.update(bid);
            return true;
        }
//        return false;
    }

    @Override
    public void update(Bid bid) {
        bidDao.update(bid);
    }

    @Override
    public List<Bid> getBids(String id) {
        if (id == null || id.trim().isEmpty()) {
            return bidDao.getBids(id);
        }
        return new ArrayList<>(Arrays.asList(findById(Integer.parseInt(id))));
    }

    @Override
    public Bid delete(Bid bid) {
        return bidDao.delete(bid);
//        return
    }

    @Override
    public Bid findById(int id) {
        return bidDao.findById(id);
    }
}
