package com.domain;

import java.io.Serializable;

/*
 * 手机实体类
 */
public class Phone implements Serializable {
	
	private String itemNum;//商品编号
	private String itemBrand;//品牌
	private String itemName;//商品名称
	private Double itemWeight;//重量
	private String itemColor;//颜色
	private String itemSystem;//系统
	private Double itemPrice;//价格
	private Integer itemBatteryCapacity;//电池容量
	private Integer itemRAM; //运行内存
	private Integer itemROM;//机身内存
	private Double itemThick;//厚度
	private Double itemScreenSize;//屏幕尺寸
	public String getItemNum() {
		return itemNum;
	}
	public void setItemNum(String itemNum) {
		this.itemNum = itemNum;
	}
	public String getItemBrand() {
		return itemBrand;
	}
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(Double itemWeight) {
		this.itemWeight = itemWeight;
	}
	public String getItemColor() {
		return itemColor;
	}
	public void setItemColor(String itemColor) {
		this.itemColor = itemColor;
	}
	public String getItemSystem() {
		return itemSystem;
	}
	public void setItemSystem(String itemSystem) {
		this.itemSystem = itemSystem;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getItemBatteryCapacity() {
		return itemBatteryCapacity;
	}
	public void setItemBatteryCapacity(Integer itemBatteryCapacity) {
		this.itemBatteryCapacity = itemBatteryCapacity;
	}
	public Integer getItemRAM() {
		return itemRAM;
	}
	public void setItemRAM(Integer itemRAM) {
		this.itemRAM = itemRAM;
	}
	public Integer getItemROM() {
		return itemROM;
	}
	public void setItemROM(Integer itemROM) {
		this.itemROM = itemROM;
	}
	public Double getItemThick() {
		return itemThick;
	}
	public void setItemThick(Double itemThick) {
		this.itemThick = itemThick;
	}
	public Double getItemScreenSize() {
		return itemScreenSize;
	}
	public void setItemScreenSize(Double itemScreenSize) {
		this.itemScreenSize = itemScreenSize;
	}
	@Override
	public String toString() {
		return "Phone [itemNum=" + itemNum + ", itemBrand=" + itemBrand + ", itemName=" + itemName + ", itemWeight="
				+ itemWeight + ", itemColor=" + itemColor + ", itemSystem=" + itemSystem + ", itemPrice=" + itemPrice
				+ ", itemBatteryCapacity=" + itemBatteryCapacity + ", itemRAM=" + itemRAM + ", itemROM=" + itemROM
				+ ", itemThick=" + itemThick + ", itemScreenSize=" + itemScreenSize + "]";
	}
	
	
	
	

}
