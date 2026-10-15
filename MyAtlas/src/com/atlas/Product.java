package com.atlas;

public class Product {
	protected String name;
	protected int price;
	
	// 부모 생성자
    public Product(String name, int price) {
    	this.name = name;
    	this.price = price;
    };

	// 상품 정보 메서드
    public String getInfo() {
    	return "상품명: " + this.name + "가격: " + this.price + "원";
    	}
    }