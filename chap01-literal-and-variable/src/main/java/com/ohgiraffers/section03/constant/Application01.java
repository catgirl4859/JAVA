package com.ohgiraffers.section03.constant;

public class Application01 {
    public static void main(String[] args) {

        /*

         상수란?
         변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면
         상수는 이와 상반되는 개념으로 변하지 않는 값(항상 고정된 값)을 저장하기 위한 메모리상의 공간이다.

         상수의 사용 목적
         변경되지 않는 고정된 값을 저장할 목적으로 사용
         초기화 이후 값 대입시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 함
         ex) 세금= 임금의 몇%

         final int AGE;  상수 선언할때 변수이름 반드시 대문자로!
                         한번 값이 설정되면 변하면 안됨!

        */

        final int AGE = 10;
        int age = AGE;
        System.out.println(age);

        age = 20;
        System.out.println(age);




    }
}
