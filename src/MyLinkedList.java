public class MyLinkedList {
    private Node head;
    private int numNodes;

    // Bước 1: Khởi tạo danh sách với 1 dữ liệu đầu tiên
    public MyLinkedList(Object data) {
        head = new Node(data);
        numNodes++;
    }

    // Inner class Node (để public để phương thức get có thể trả về kiểu Node)
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    // Bước 2: Thêm phần tử vào vị trí index
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        // Di chuyển temp đến vị trí ngay trước vị trí cần chèn (index - 1)
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        // Thực hiện chèn nút
        holder = temp.next;          // 1. Giữ liên kết đến nút phía sau
        temp.next = new Node(data);  // 2. Trỏ nút hiện tại đến nút mới
        temp.next.next = holder;     // 3. Trỏ nút mới đến nút phía sau cũ
        numNodes++;
    }

    // Bước 3: Thêm phần tử vào đầu danh sách
    public void addFirst(Object data) {
        Node temp = head;           // Giữ head cũ
        head = new Node(data);      // Tạo head mới
        head.next = temp;           // Trỏ head mới vào head cũ
        numNodes++;
    }

    // Bước 4: Lấy node tại vị trí index
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            // Kiểm tra null để tránh lỗi nếu index vượt quá độ dài
            if (temp == null) return null;
            temp = temp.next;
        }
        return temp;
    }

    // Bước 5: In danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}