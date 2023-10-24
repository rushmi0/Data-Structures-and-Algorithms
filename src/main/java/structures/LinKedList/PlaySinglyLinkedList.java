package structures.LinKedList;


public class PlaySinglyLinkedList {

    public static void main(String[] args) {

        // สร้างอ็อบเจกต์ LinkedList และกำหนดค่าเริ่มต้นเป็น 4 เนื่องจากการสร้างอ็อบเจกต์ใหม่จะเรียกใช้คอนสตรักเตอร์ของคลาส LinkedList ซึ่งจะสร้างโหนดแรกของลิงค์ลิสต์ให้โดยอัตโนมัติ
        SinglyLinkedList myLinkedList = new SinglyLinkedList((int) (Math.random() * 20) + 1);


        // สร้าง For Loop เพื่อเพิ่มข้อมูลในลิงค์ลิสต์
        for (int i = 1; i < 4; i++) {
            // สร้างและกำหนดตัวแปร Random ตัวเลย
            int random = (int) (Math.random() * 20) + 1;

            // เพิ่มข้อมูลในลิงค์ลิสต์
            myLinkedList.append(random);
        }

        // แสดงค่าข้อมูลทั้งหมดในลิงค์ลิสต์
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // แสดงค่าข้อมูลทั้งหมดในลิงค์ลิสต์
        myLinkedList.printList();

    }

}
