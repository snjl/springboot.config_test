package com.example.myproject.domain;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:range.properties")
@ConfigurationProperties(prefix = "range")
public class Range {
    private String secret;
    private int number;
    private long bignumber;
    private String uuid;
    @Value("${range.number.less.than.ten}")
    private int lessThanTen;
    @Value("${range.number.in.range}")
    private int rangeNumber;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public long getBignumber() {
        return bignumber;
    }

    public void setBignumber(long bignumber) {
        this.bignumber = bignumber;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getLessThanTen() {
        return lessThanTen;
    }

    public void setLessThanTen(int lessThanTen) {
        this.lessThanTen = lessThanTen;
    }

    public int getRangeNumber() {
        return rangeNumber;
    }

    public void setRangeNumber(int rangeNumber) {
        this.rangeNumber = rangeNumber;
    }
}
