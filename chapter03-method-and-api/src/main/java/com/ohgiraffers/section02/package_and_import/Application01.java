package main.java.com.ohgiraffers.section02.package_and_import;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumber;
//static 에 올라가있는 이 경로에 있는 maxNumber 함수를 불러와야 한다.
//minNumber 함수는 static에 안올라가 있기 때문에 객체 새로 힙영역에 생성해서
//불러오면됨 ㅎ

public class Application01 {
    public static void main(String[] args) {

        int first = 200;
        int second = 300;

        int max = maxNumber(first, second);
        System.out.println(max);



    }
}

