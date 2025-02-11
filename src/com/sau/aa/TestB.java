package com.sau.aa;

public class TestB {
    public static void main(String[] args) {
        Hi ob1 = new Hi();

        Hi ob2 = new Hi(50);

        //การใฃ้งาน object/instance คือ การใฃ้งาน Data และ Method
        //การใฃ้งาน data คือ กำหนดค่าให้มันใหม่ หรือ เอามันมาใฃ้

        ob1.aa = 99;

        System.out.println(ob1.aa + ob2.aa);

        //การใฃ้งาน method คือการสั่งให้ medhod นั้นๆ ทำงาน
    }
}
