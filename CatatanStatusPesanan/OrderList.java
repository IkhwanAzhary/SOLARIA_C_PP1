package CatatanStatusPesanan;

public class OrderList {
 private OrderNode head;

 public void tambahPesanan(Order order) {
     OrderNode newNode = new OrderNode(order);
     if (head == null) {
         head = newNode;
     } else {
         OrderNode current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newNode;
     }
 }

 public void ubahStatus(int orderId) {
     OrderNode current = head;
     while (current != null) {
         if (current.order.getOrderId() == orderId) {
             OrderStatus currentStatus = current.order.getStatus();
             if (currentStatus != OrderStatus.DITERIMA) {
                 current.order.setStatus(OrderStatus.values()[currentStatus.ordinal() + 1]);
                 System.out.println("Status pesanan #" + orderId + " diubah menjadi: " + current.order.getStatus());
             } else {
                 System.out.println("Pesanan #" + orderId + " sudah DITERIMA.");
             }
             return;
         }
         current = current.next;
     }
     System.out.println("Pesanan dengan ID #" + orderId + " tidak ditemukan.");
 }

public boolean deleteOrder(int orderId) {
    if (head == null) return false;

    if (head.order.getOrderId() == orderId) {
        head = head.next;
        return true;
    }

    OrderNode current = head;
    while (current.next != null) {
        if (current.next.order.getOrderId() == orderId) {
            current.next = current.next.next;
            return true;
        }
        current = current.next;
    }

    return false;
}



 public void tampilkanPesanan() {
     OrderNode current = head;
     while (current != null) {
         System.out.println(current.order);
         current = current.next;
     }
 }
}

