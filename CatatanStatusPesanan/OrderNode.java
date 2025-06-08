package CatatanStatusPesanan;

public class OrderNode {
    public Order order;
    public OrderNode next;

    public OrderNNode (Order order) {
        this.order = order;
        this.next = null;
    }
}

