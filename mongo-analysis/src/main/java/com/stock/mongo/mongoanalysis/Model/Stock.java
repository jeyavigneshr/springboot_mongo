package com.stock.mongo.mongoanalysis.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stock {
    private Integer id;
    private String name;
    public Stock(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
