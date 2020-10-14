package com.stock.mongo.mongoanalysis.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.mongo.mongoanalysis.Model.Stock;

@Service
public class FileReaderService implements IFileReaderService{
	
	 @Autowired
	 private MongoConfig mongoConfig;
	
    @Override
    public String parseFile() throws IOException {
        String currentDir = System.getProperty("user.dir");
        String path = currentDir+File.separator+"scandi.csv";
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        int i= 0;
	br.lines().skip(0).map(line ->{
        	String[] record = line.split(",");
			Stock stock = new Stock();
			stock.setBloombergCode(record[0]);
			stock.setBidPrice(Double.parseDouble(record[2]));
			stock.setAskPrice(Double.parseDouble(record[3]));
			stock.setTradePrice(Double.parseDouble(record[4]));
			stock.setBidVolume(Double.parseDouble(record[5]));
			stock.setAskVolume(Double.parseDouble(record[6]));
			stock.setTradeVolume(Double.parseDouble(record[7]));
			stock.setUpdateType(Integer.parseInt(record[8]));
			stock.setDate(record[10]);
			stock.setTime(Double.parseDouble(record[11]));
			stock.setOpenPrice(Double.parseDouble(record[12]));
			stock.setConditionCodes(record[14]);
			return stock;
        }).filter(e -> (e.getConditionCodes() == null || e.getConditionCodes().equals("XT") || e.getConditionCodes().length() == 0)
        		&& (e.getBidPrice() < e.getAskPrice()))
    		   .forEach(e -> {
    			   System.out.println("Inserting");
    			   mongoConfig.addRecord(e);
    		   });
       System.out.println(i);
        br.close();
        return "Success";
    }

}
