package com.sau.wow;

public class Test01 {
    public static void main(String[] args) {
        //สร้าง Object/Instace of Class
        // วิธีที่ 1 มี 2 ขั้นตอน
        DTISAU mod;
        mod = new DTISAU();

        //วิธี 2 มี 1 ชั้นตอน
        DTISAU med = new DTISAU();

        //การใฃ้งาน Object/Instace คือการใช้งาน data/method
        //การใฃ้งาน data คือ เปลี่ยนให้มันใหม่ หรือเอาค่ามันมาใฃ้
        //การใฃ้งาน method คือ ให้ method ชอง Object/Instace นั้นๆ ทำงาน
        mod.name = "สมฃาย";
        System.out.println(mod.name + " สูง " + mod.high);

        med.name = "สมศรี";
        med.showHi();

    }
}
