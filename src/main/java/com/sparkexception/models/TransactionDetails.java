package com.sparkexception.models;

import java.io.Serializable;

import lombok.Data;

@Data
public class TransactionDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String region;
	private String country;
	private String itemType;
	private String salesChannel;
	private String orderPriority;
	private String orderDate;
	private String orderId;
	private String shipDate;
	private String unitsSold;
	private String unitPrice;
	private String unitCost;
	private String totalRevenue;
	private String totalCost;
	private String totalProfit;
}
