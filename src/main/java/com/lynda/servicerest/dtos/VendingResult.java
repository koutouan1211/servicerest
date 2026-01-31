package com.lynda.servicerest.dtos;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "result")
@XmlAccessorType(XmlAccessType.FIELD)
public class VendingResult {

   

	@XmlAttribute
    private Integer state;

    @XmlAttribute
    private String code;

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
    private Integer buyTimes;

    @XmlAttribute
    private Double calcQty;

    @XmlAttribute
    private Double vendQty;

    @XmlAttribute
    private Double vendAMT;

    @XmlAttribute
    private String customerName;

    @XmlAttribute
    private Double supplyAMT;

    @XmlAttribute
    private Double arrearAMT;

    @XmlAttribute
    private Double feeAMT;

    @XmlAttribute
    private Double AMT;

    @XmlAttribute
    private Double VAT;

    @XmlAttribute
    private Double stampTax;

    @XmlAttribute
    private Double netAMT;

    @XmlAttribute
    private Double commAMT;

    @XmlAttribute
    private String token;

    @XmlAttribute
    private String invoice;

    @XmlAttribute
    private String verifyCode;

    @XmlAttribute
    private String checkCode;

    @XmlAttribute
    private String transID;
    
    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Integer getBuyTimes() {
		return buyTimes;
	}

	public void setBuyTimes(Integer buyTimes) {
		this.buyTimes = buyTimes;
	}

	public Double getCalcQty() {
		return calcQty;
	}

	public void setCalcQty(Double calcQty) {
		this.calcQty = calcQty;
	}

	public Double getVendQty() {
		return vendQty;
	}

	public void setVendQty(Double vendQty) {
		this.vendQty = vendQty;
	}

	public Double getVendAMT() {
		return vendAMT;
	}

	public void setVendAMT(Double vendAMT) {
		this.vendAMT = vendAMT;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Double getSupplyAMT() {
		return supplyAMT;
	}

	public void setSupplyAMT(Double supplyAMT) {
		this.supplyAMT = supplyAMT;
	}

	public Double getArrearAMT() {
		return arrearAMT;
	}

	public void setArrearAMT(Double arrearAMT) {
		this.arrearAMT = arrearAMT;
	}

	public Double getFeeAMT() {
		return feeAMT;
	}

	public void setFeeAMT(Double feeAMT) {
		this.feeAMT = feeAMT;
	}

	public Double getAMT() {
		return AMT;
	}

	public void setAMT(Double aMT) {
		AMT = aMT;
	}

	public Double getVAT() {
		return VAT;
	}

	public void setVAT(Double vAT) {
		VAT = vAT;
	}

	public Double getStampTax() {
		return stampTax;
	}

	public void setStampTax(Double stampTax) {
		this.stampTax = stampTax;
	}

	public Double getNetAMT() {
		return netAMT;
	}

	public void setNetAMT(Double netAMT) {
		this.netAMT = netAMT;
	}

	public Double getCommAMT() {
		return commAMT;
	}

	public void setCommAMT(Double commAMT) {
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

	public String getTransID() {
		return transID;
	}

	public void setTransID(String transID) {
		this.transID = transID;
	}

    // getters & setters
}
