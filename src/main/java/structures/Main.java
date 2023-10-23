package structures;

import structures.LinKedList.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {


        SinglyLinkedList myLinkedList = new SinglyLinkedList(4);

        // สร้าง For Loop เพื่อเพิ่มข้อมูลในลิงค์ลิสต์ เพิ่มที่ละ 3
        for (int i = 1; i < 4; i++) {
            // สร้างและกำหนดตัวแปร Random ตัวเลย
            int random = (int) (Math.random() * 100) + 1;

            // เพิ่มข้อมูลในลิงค์ลิสต์
            myLinkedList.append(random);
        }

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // แสดงค่าข้อมูลทั้งหมดในลิงค์ลิสต์
        myLinkedList.printList();


    }
}