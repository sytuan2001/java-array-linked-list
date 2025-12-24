public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");

        // Khởi tạo list với giá trị 10. List hiện tại: 10
        MyLinkedList ll = new MyLinkedList(10);

        // Thêm vào đầu: 11. List: 11 -> 10
        ll.addFirst(11);

        // Thêm vào đầu: 12. List: 12 -> 11 -> 10
        ll.addFirst(12);

        // Thêm vào đầu: 13. List: 13 -> 12 -> 11 -> 10
        ll.addFirst(13);

        // Lúc này các chỉ số (index) là:
        // Index 0: 13
        // Index 1: 12
        // Index 2: 11
        // Index 3: 10

        // Thêm số 9 vào index 4 (cuối hàng). List: 13 -> 12 -> 11 -> 10 -> 9
        ll.add(4, 9);

        // Thêm số 9 vào index 4 một lần nữa.
        // Lúc này index 4 đang là số 9 (vừa thêm ở trên).
        // Chèn vào vị trí 4 có nghĩa là chèn SAU vị trí 3 (số 10).
        // List: 13 -> 12 -> 11 -> 10 -> 9 -> 9
        ll.add(4, 9);

        // In kết quả
        ll.printList();
    }
}