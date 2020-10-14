package com.stock.mongo.mongoanalysis.Controllers;

import com.stock.mongo.mongoanalysis.Model.Stock;
import com.stock.mongo.mongoanalysis.Repository.StockAnalysis;
import com.stock.mongo.mongoanalysis.Service.MongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private MongoConfig mongoConfig;

    @GetMapping("/insert")
    public String insertData(){
        Stock stock = new Stock(1,"Jey");
        String a = mongoConfig.addRecord(stock);
        return a;
    }

    @GetMapping("/find")
    public List<Stock> getData(){
        return mongoConfig.getStock();
    }

}
