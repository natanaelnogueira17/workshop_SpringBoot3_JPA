package com.aprendendoSpring.course.entities.enums;

public enum OrdersStatus {
	
	WAITING_PAYMENT(0),
	PAID(1),
	SHIPPED(2),
	DELIVERED(3),
	CANCELED(4);

	private int id;

	private OrdersStatus(int id) {
		this.id = id;
	}
	
	public int getCode() {
		return id;
	}
	

}
