package main.java.com.ohgiraffers.section01.method;

public class Application02 {
    public static void main(String[] args) {
        /*
        변수의 종류
        1. 지역변수
        2. 매개변수
        3. 전역변수(필드)
        4. 클래스(static)변수
         */
        int age =20;
        Application02 apple1 = new Application02();
        apple1.testMethod1(40);
        apple1.testMethod2(age);
        apple1.testMethod3(1000, 2000);
    }
    public void testMethod1(int age){
       System.out.println(age);
    }
    public void testMethod2(int age){
        System.out.println(age);
    }
    public void testMethod3(int x, int y){
        int z = x+y;
        System.out.println(z);
        return;
    }
}

