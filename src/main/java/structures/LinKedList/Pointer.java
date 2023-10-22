package structures.LinKedList;

import java.util.HashMap;

public class Pointer {

    public static void main(String[] args) {

        // สร้าง HashMap ชื่อ map1 และ map2
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        // เพิ่มค่า "value" ด้วยค่า 11 เข้าใน map1
        map1.put("value", 11);

        // กำหนดให้ map2 เป็นอ้างอิงถึง map1
        map2 = map1;

        // แสดงค่าทั้งหมดใน map1
        System.out.println(map1);

        // หาที่อยู่หน่วยความจำของ map1 โดยใช้ System.identityHashCode
        Integer addr1 = System.identityHashCode(map1);
        System.out.println(addr1);

        // แสดงค่าทั้งหมดใน map2 (ซึ่งก็คือ map1)
        System.out.println(map2);

        // หาที่อยู่หน่วยความจำของ map2 (ซึ่งก็คือ map1) โดยใช้ System.identityHashCode
        Integer addr2 = System.identityHashCode(map2);
        System.out.println(addr2);
    }
}
