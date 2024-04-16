package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {

        /*
        데이터 형변환이 필요한 이유
        자바에서 다른 타입끼리의 연ㅅ나은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        즉, 같은 데이터 타입기리만 연산을 수행할 수 있다.

        형변환의 종류, 규칙
        1. 자동형변환(묵시적 형변환): 컴파일러가 자동으로 수행해주는 타입 변환
            1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 됨
            1-2. 정수는 실수로 자동 형변환 됨
            1-3. 문자형은 int형으로 자도 형변환 됨
            1-4. 논리형은 형변화 ㄴ규칙에서 제외

          2. 강제형변환(명시적 형변환): 형변환 연산자를 이용한 강세적으로 수행하는 형변환
            2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요

        */

        /* int a = 9L + 10;
        double b = double(9l + 10l);
        long C = 9L + 10; */


        int num1 = 10;
        long num2 = 20;

//        int result1 = num1+num2;
          long result1 = num1+num2;








    }
}
