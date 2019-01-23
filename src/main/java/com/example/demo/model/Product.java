package com.example.demo.model;
import java.awt.List;
import java.util.ArrayList;

public class Product {
  
    String productId ;
    String title ;
    String  nowPrice;
    String labelytpe;
    ArrayList<ColorSwatches>Color;
	public Product() {
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNowPrice() {
		return nowPrice;
	}
	public void setNowPrice(String nowPrice) {
		this.nowPrice = nowPrice;
	}
	public String getLabelytpe() {
		return labelytpe;
	}
	public void setLabelytpe(String labelytpe) {
		this.labelytpe = labelytpe;
	}
	public ArrayList<ColorSwatches> getColor() {
		return Color;
	}
	public void setColor(ArrayList<ColorSwatches> color) {
		Color = color;
	}
	}
     
 

