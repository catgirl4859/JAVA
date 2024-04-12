package com.ohgiraffers.section02.variable;

public class Application02 {
    public static void main(String[] args) {

        String str;
        str= "안녕하세요";
        System.out.println(str);

        // = 은 대입연산자 !!!!
        // 기본이 4byte 설정이기 때문에 long 쓸때는 값뒤에 L 붙여야지
        // long 로 저장됨. 안그러면 int(4byte) 크기로 됨
        // 실수에서는 기본이 double!
        // 따라서 float fnum=0.3f; float에 저장하고 싶으면 값 뒤에 float 붙이면됨

        char apple = 'A';
        System.out.println(apple);

        int a = 100;
        int b = 200;
        long c = 300;
        long d = 400;

//        int f1 = c+d;
        long f = c+d;
        System.out.println(a+b);
        System.out.println(c+d);










    }
}
