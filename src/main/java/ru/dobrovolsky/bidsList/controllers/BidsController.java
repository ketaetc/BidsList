package ru.dobrovolsky.bidsList.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.dobrovolsky.bidsList.model.Bid;
import ru.dobrovolsky.bidsList.service.BidService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bid")
public class BidsController {

    @Autowired
    private BidService bidService;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Bid> getBids(String search) {
        return bidService.getBids(search);
    }
//    public Bid findById(int id) {
//        return bidService.findById(id);
//    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ExtResult setBid(@RequestBody Bid bid) {
        return new ExtResult(bidService.add(bid), bid);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Map<String,Object> deleteBid(@RequestBody Bid bid) {
//    public void deleteBid(@RequestBody Bid bid) {

//        return new ArrayList<>(Arrays.asList("delete"));
        bidService.delete(bid);
//        return "delete";
        Map<String,Object> map = new HashMap<>();
//        map.put("total", 1);
        map.put("data", bid);
        map.put("success", true);

//        return bidService.delete(bid);
        return map;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.PUT)
    @ResponseBody
//    public String updateBid(@RequestBody Bid bid) {
    public Map<String,Object> updateBid(@RequestBody Bid bid) {
        bidService.update(bid);

        Map<String,Object> map = new HashMap<>();
        map.put("data", bid);
        map.put("success", true);

//        return "update";
        return map;
    }
}
