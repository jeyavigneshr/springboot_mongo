package com.stock.mongo.mongoanalysis.Service;

import com.stock.mongo.mongoanalysis.Model.Stock;
import com.stock.mongo.mongoanalysis.Repository.StockAnalysis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@EnableMongoRepositories(basePackageClasses = StockAnalysis.class)
@Configuration
public class MongoConfig {

    @Autowired
    StockAnalysis stockAnalysis;

    public String addRecord(Stock stock){
        stockAnalysis.save(stock);
        return "Success";
    }

    public List<Stock> getStock(){
       return stockAnalysis.findAll();
    }

}
