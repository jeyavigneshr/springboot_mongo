package com.stock.mongo.mongoanalysis.Model;

import java.io.Serializable;

import javax.annotation.Generated;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Stock implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6532503665103802250L;
	@Id
	private ObjectId id;
    private String bloombergCode;
    private double bidPrice;
    private double askPrice;
    private double tradePrice;
    private double bidVolume;
    private double askVolume;
    private double tradeVolume;
    private int updateType;
    private String date;
    private double time;
    private double openPrice;
    private String conditionCodes;
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getBloombergCode() {
		return bloombergCode;
	}
	public void setBloombergCode(String bloombergCode) {
		this.bloombergCode = bloombergCode;
	}
	public double getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(double bidPrice) {
		this.bidPrice = bidPrice;
	}
	public double getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(double askPrice) {
		this.askPrice = askPrice;
	}
	public double getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(double tradePrice) {
		this.tradePrice = tradePrice;
	}
	public double getBidVolume() {
		return bidVolume;
	}
	public void setBidVolume(double bidVolume) {
		this.bidVolume = bidVolume;
	}
	public double getAskVolume() {
		return askVolume;
	}
	public void setAskVolume(double askVolume) {
		this.askVolume = askVolume;
	}
	public double getTradeVolume() {
		return tradeVolume;
	}
	public void setTradeVolume(double tradeVolume) {
		this.tradeVolume = tradeVolume;
	}
	public int getUpdateType() {
		return updateType;
	}
	public void setUpdateType(int updateType) {
		this.updateType = updateType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public double getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(double openPrice) {
		this.openPrice = openPrice;
	}
	public String getConditionCodes() {
		return conditionCodes;
	}
	public void setConditionCodes(String conditionCodes) {
		this.conditionCodes = conditionCodes;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Stock [id=" + id + ", bloombergCode=" + bloombergCode + ", bidPrice=" + bidPrice + ", askPrice="
				+ askPrice + ", tradePrice=" + tradePrice + ", bidVolume=" + bidVolume + ", askVolume=" + askVolume
				+ ", tradeVolume=" + tradeVolume + ", updateType=" + updateType + ", date=" + date + ", time=" + time
				+ ", openPrice=" + openPrice + ", conditionCodes=" + conditionCodes + "]";
	}
	        
    
}
