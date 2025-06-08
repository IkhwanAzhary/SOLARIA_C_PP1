package CatatanStatusPesanan;

public class Order {
	private int orderId;
	private String customerName;
	private OrderStatus status;

	public Order(int orderId, String customerName) {
		this.orderId = orderId;
		this.customerName = customerName;
		this.status = OrderStatus.DIPESAN;
	}

	public int getOrderId() {
		return orderId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	// @Override
	public String toString() {
		return "Pesanan #" + orderId + " - " + customerName + " [" + status + "]";
	}
}