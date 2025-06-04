public class Node {
	private StatusPesanan data;
    private Node next;

    public Node(StatusPesanan data) {
        this.data = data;
    }

    public StatusPesanan getData() { return data; }
    public void setData(StatusPesanan data) { this.data = data; }

    public Node getNext() { return next; }
    public void setNext(Node next) { this.next = next; }
}