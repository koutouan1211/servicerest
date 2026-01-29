package com.lynda.servicerest.dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class LastTransactionsResult {

    @XmlAttribute
    private int state;

    @XmlAttribute
    private int count;

    @XmlAttribute(name = "ti0")
    private String transactionId0;

    @XmlAttribute(name = "tt0")
    private String transactionTime0;

    @XmlAttribute(name = "ti1")
    private String transactionId1;

    @XmlAttribute(name = "tt1")
    private String transactionTime1;

    @XmlAttribute(name = "ti2")
    private String transactionId2;

    @XmlAttribute(name = "tt2")
    private String transactionTime2;

    @XmlAttribute(name = "ti3")
    private String transactionId3;

    @XmlAttribute(name = "tt3")
    private String transactionTime3;

    @XmlAttribute(name = "ti4")
    private String transactionId4;

    @XmlAttribute(name = "tt4")
    private String transactionTime4;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getTransactionId0() {
		return transactionId0;
	}

	public void setTransactionId0(String transactionId0) {
		this.transactionId0 = transactionId0;
	}

	public String getTransactionTime0() {
		return transactionTime0;
	}

	public void setTransactionTime0(String transactionTime0) {
		this.transactionTime0 = transactionTime0;
	}

	public String getTransactionId1() {
		return transactionId1;
	}

	public void setTransactionId1(String transactionId1) {
		this.transactionId1 = transactionId1;
	}

	public String getTransactionTime1() {
		return transactionTime1;
	}

	public void setTransactionTime1(String transactionTime1) {
		this.transactionTime1 = transactionTime1;
	}

	public String getTransactionId2() {
		return transactionId2;
	}

	public void setTransactionId2(String transactionId2) {
		this.transactionId2 = transactionId2;
	}

	public String getTransactionTime2() {
		return transactionTime2;
	}

	public void setTransactionTime2(String transactionTime2) {
		this.transactionTime2 = transactionTime2;
	}

	public String getTransactionId3() {
		return transactionId3;
	}

	public void setTransactionId3(String transactionId3) {
		this.transactionId3 = transactionId3;
	}

	public String getTransactionTime3() {
		return transactionTime3;
	}

	public void setTransactionTime3(String transactionTime3) {
		this.transactionTime3 = transactionTime3;
	}

	public String getTransactionId4() {
		return transactionId4;
	}

	public void setTransactionId4(String transactionId4) {
		this.transactionId4 = transactionId4;
	}

	public String getTransactionTime4() {
		return transactionTime4;
	}

	public void setTransactionTime4(String transactionTime4) {
		this.transactionTime4 = transactionTime4;
	}

	@Override
	public String toString() {
		return "LastTransactionsResult [state=" + state + ", count=" + count + ", transactionId0=" + transactionId0
				+ ", transactionTime0=" + transactionTime0 + ", transactionId1=" + transactionId1
				+ ", transactionTime1=" + transactionTime1 + ", transactionId2=" + transactionId2
				+ ", transactionTime2=" + transactionTime2 + ", transactionId3=" + transactionId3
				+ ", transactionTime3=" + transactionTime3 + ", transactionId4=" + transactionId4
				+ ", transactionTime4=" + transactionTime4 + "]";
	}

    // getters & setters
    
}
