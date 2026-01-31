package com.lynda.servicerest.dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class SearchResult {

    @XmlAttribute
    private int state;

    @XmlAttribute
    private String code;

    @XmlAttribute
    private String transID;

    @XmlAttribute
    private String transTime;

    @XmlAttribute
    private String regCode;

    @XmlAttribute
    private String refCode;

    @XmlAttribute
    private String meterNum;

    @XmlAttribute
    private String tariffCode;

    @XmlAttribute
    private int buyTimes;

    @XmlAttribute
    private double calcQty;

    @XmlAttribute
    private double vendQty;

    @XmlAttribute
    private double vendAMT;

    @XmlAttribute
    private String customerName;

    @XmlAttribute
    private double supplyAMT;

    @XmlAttribute
    private double arrearAMT;

    @XmlAttribute
    private double feeAMT;

    @XmlAttribute
    private double AMT;

    @XmlAttribute
    private double VAT;

    @XmlAttribute
    private double stampTax;

    @XmlAttribute
    private double netAMT;

    @XmlAttribute
    private double commAMT;

    @XmlAttribute
    private String token;

    @XmlAttribute
    private String invoice;

    @XmlAttribute
    private String verifyCode;

    @XmlAttribute
    private String checkCode;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public String getRefCode() {
		return refCode;
	}

	public void setRefCode(String refCode) {
		this.refCode = refCode;
	}

	public String getMeterNum() {
		return meterNum;
	}

	public void setMeterNum(String meterNum) {
		this.meterNum = meterNum;
	}

	public String getTariffCode() {
		return tariffCode;
	}

	public void setTariffCode(String tariffCode) {
		this.tariffCode = tariffCode;
	}

	public int getBuyTimes() {
		return buyTimes;
	}

	public void setBuyTimes(int buyTimes) {
		this.buyTimes = buyTimes;
	}

	public double getCalcQty() {
		return calcQty;
	}

	public void setCalcQty(double calcQty) {
		this.calcQty = calcQty;
	}

	public double getVendQty() {
		return vendQty;
	}

	public void setVendQty(double vendQty) {
		this.vendQty = vendQty;
	}

	public double getVendAMT() {
		return vendAMT;
	}

	public void setVendAMT(double vendAMT) {
		this.vendAMT = vendAMT;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getSupplyAMT() {
		return supplyAMT;
	}

	public void setSupplyAMT(double supplyAMT) {
		this.supplyAMT = supplyAMT;
	}

	public double getArrearAMT() {
		return arrearAMT;
	}

	public void setArrearAMT(double arrearAMT) {
		this.arrearAMT = arrearAMT;
	}

	public double getFeeAMT() {
		return feeAMT;
	}

	public void setFeeAMT(double feeAMT) {
		this.feeAMT = feeAMT;
	}

	public double getAMT() {
		return AMT;
	}

	public void setAMT(double aMT) {
		AMT = aMT;
	}

	public double getVAT() {
		return VAT;
	}

	public void setVAT(double vAT) {
		VAT = vAT;
	}

	public double getStampTax() {
		return stampTax;
	}

	public void setStampTax(double stampTax) {
		this.stampTax = stampTax;
	}

	public double getNetAMT() {
		return netAMT;
	}

	public void setNetAMT(double netAMT) {
		this.netAMT = netAMT;
	}

	public double getCommAMT() {
		return commAMT;
	}

	public void setCommAMT(double commAMT) {
		this.commAMT = commAMT;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getVerifyCode() {
		return verifyCode;
	}

	public void setVerifyCode(String verifyCode) {
		this.verifyCode = verifyCode;
	}

	public String getCheckCode() {
		return checkCode;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

    // getters & setters
    
    
}

