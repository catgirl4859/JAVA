package com.ohgiraffers.section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        /* overflow 넘저흐르면 초기화 !
        *
        * 자료형마다 값의 최대 범위를 벗어나는 경우 발생한 carry를 버림처리 하고 sing bit를 반전시켜
        * 최소값으로 순환시킴
        *
        * */

        int firstNum = 1000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + multi);















    }
}
