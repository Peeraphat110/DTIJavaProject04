package com.sau.dti.method;

public class MyClassMet01 {
    //method คือ function คือ การทำงานหนึ่ง ที่จะไม่ทำงานหากไม่เรียกใฃ้ (call method)
    public static void showHi(){
        System.out.println("Hi...");
    }

    public static void showHello(){
        System.out.println("Hello...");
    }

    public static void main(String[] args) {
        showHi();
        showHi();
        showHey();
    }

    public static void showHey(){
        System.out.println("Hey...");
        showHi();
    }
}
