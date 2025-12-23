public class MyListTest {
    public static void main(String[] args) {
        MyList <Integer> listInteger = new MyList<Integer>();
        // Thêm dữ liệu vào
        listInteger.add(1); // Index 0
        listInteger.add(2); // Index 1
        listInteger.add(3); // Index 2
        listInteger.add(4); // Index 3
        listInteger.add(5); // Index 4

        // --- TRƯỜNG HỢP 0: TRUY CẬP HỢP LỆ ---
        System.out.println("element 4: " + listInteger.get(4)); // In ra 5
        System.out.println("element 1: " + listInteger.get(1)); // In ra 2
        System.out.println("element 2: " + listInteger.get(2)); // In ra 3
        System.out.println("element 0: " +listInteger.get(0));

        // --- TRƯỜNG HỢP 1: TRUY CẬP QUÁ GIỚI HẠN (Index >= Size) ---
        // Bỏ comment 2 dòng dưới để chạy thử, chương trình sẽ báo lỗi IndexOutOfBoundsException


        // --- TRƯỜNG HỢP 2: TRUY CẬP INDEX ÂM (Index < 0) ---
        // Bỏ comment dòng dưới để chạy thử

         listInteger.get(-1);
         System.out.println("element -1: " + listInteger.get(-1));
    }
}
