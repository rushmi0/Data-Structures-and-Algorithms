package structures.LinKedList;

public class Main {

    public static void main(String[] args) {

        // สร้างอ็อบเจกต์ LinkedList และกำหนดค่าเริ่มต้นเป็น 4 เนื่องจากการสร้างอ็อบเจกต์ใหม่จะเรียกใช้คอนสตรักเตอร์ของคลาส LinkedList ซึ่งจะสร้างโหนดแรกของลิงค์ลิสต์ให้โดยอัตโนมัติ
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // แสดงค่าข้อมูลทั้งหมดในลิงค์ลิสต์
        myLinkedList.printList();

    }

}
