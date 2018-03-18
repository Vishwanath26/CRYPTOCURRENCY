package com.gontuseries.hellocontroller;

import java.util.Date;

public class Coin {

    private Date Cdate;
    private double TxVolume;
    private double TxCount;
    private double MarketCap;
    private double Price;
    private double ExchangeValue;
    private double GeneratedCoins;
    private double Fees;



    //functions
    public Date getCdate() {
        return Cdate;
    }
    public void setCdate(Date cdate) {
        Cdate = cdate;
    }
    public double getTxVolume() {
        return TxVolume;
    }
    public void setTxVolume(double txVolume) {
        TxVolume = txVolume;
    }
    public double getTxCount() {
        return TxCount;
    }
    public void setTxCount(double txCount) {
        TxCount = txCount;
    }
    public double getMarketCap() {
        return MarketCap;
    }
    public void setMarketCap(double marketCap) {
        MarketCap = marketCap;
    }
    public double getPrice() {
        return Price;
    }
    public void setPrice(double price) {
        Price = price;
    }
    public double getExchangeValue() {
        return ExchangeValue;
    }
    public void setExchangeValue(double exchangeValue) {
        ExchangeValue = exchangeValue;
    }
    public double getGeneratedCoins() {
        return GeneratedCoins;
    }
    public void setGeneratedCoins(double generatedCoins) {
        GeneratedCoins = generatedCoins;
    }
    public double getFees() {
        return Fees;
    }
    public void setFees(double fees) {
        Fees = fees;
    }

}
