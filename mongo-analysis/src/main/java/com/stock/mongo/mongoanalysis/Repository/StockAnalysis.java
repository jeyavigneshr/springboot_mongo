package com.stock.mongo.mongoanalysis.Repository;

import com.stock.mongo.mongoanalysis.Model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StockAnalysis extends MongoRepository<Stock,String> {
}
