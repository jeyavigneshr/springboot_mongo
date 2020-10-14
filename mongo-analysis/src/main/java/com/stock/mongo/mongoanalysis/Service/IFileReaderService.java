package com.stock.mongo.mongoanalysis.Service;

import java.io.IOException;
import java.util.List;

import com.stock.mongo.mongoanalysis.Model.Stock;

public interface IFileReaderService {
     public String parseFile() throws IOException;
}
