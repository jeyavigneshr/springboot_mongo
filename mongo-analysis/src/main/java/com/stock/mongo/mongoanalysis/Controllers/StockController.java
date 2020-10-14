package com.stock.mongo.mongoanalysis.Controllers;

import com.stock.mongo.mongoanalysis.Model.Stock;
import com.stock.mongo.mongoanalysis.Repository.StockAnalysis;
import com.stock.mongo.mongoanalysis.Service.IFileReaderService;
import com.stock.mongo.mongoanalysis.Service.MongoConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private MongoConfig mongoConfig;
    @Autowired
    private IFileReaderService fileReaderService;

    @GetMapping("/insert")
    public ResponseEntity<String> insertData() throws IOException {
        String a = fileReaderService.parseFile();
        return new ResponseEntity<String>(a, HttpStatus.OK);
    }

    @GetMapping("/find")
    public List<Stock> getData(){
        return mongoConfig.getStock();
    }

}
