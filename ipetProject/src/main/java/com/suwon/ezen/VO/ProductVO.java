package com.suwon.ezen.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ProductVO {
	private int pno;
	private String pname;
	private int price;
	private int amount;
	private int total;
	private String buyer;
	public ProductVO setPname(String pname) {
		this.pname = pname;
		return this;
	}
	public ProductVO setPrice(int price) {
		this.price = price;
		return this;
	}
	public ProductVO setAmount(int amount) {
		this.amount = amount;
		return this;
	}
	public ProductVO setTotal(int total) {
		this.total = total;
		return this;
	}
	public ProductVO setBuyer(String buyer) {
		this.buyer = buyer;
		return this;
	}
	
	
}
