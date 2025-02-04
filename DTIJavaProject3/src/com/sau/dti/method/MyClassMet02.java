package com.sau.dti.method;

public class MyClassMet02 {
    //ประเภทของ Method
    //1 ไม่มี parameter ไม่มี return
    public static void showWow(){
        System.out.println("Wow wow wow");
    }

    //2 มี paramerter ไม่มี return
    public static void sumNumber(int num1, int num2){
        System.out.println(num1 + num2);
    }

    //3 ไม่มี parameter มี return
    public static String showSawasdee(){
        return "Sawasdee Jaaaaa....";
    }

    //มี paramerter มี return
    public static double calPowNumber(int a, int b){
        return Math.pow(a, b);
    }
    public static void main(String[] args) {
        showWow();
        showWow();
        showWow();
        sumNumber(10,20); // ค่าที่ส่งให้  parameter  เรียกว่า argument
        sumNumber(100, 200);

        //------------------
        System.out.println( showSawasdee() );
        String data = showSawasdee();
        System.out.println(data +"NinniN");

        System.out.println( calPowNumber(10, 2));
        double result = calPowNumber(5,3);
        System.out.println("5^3 = " + result);

    }
}
