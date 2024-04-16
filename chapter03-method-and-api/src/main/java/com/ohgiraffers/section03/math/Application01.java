package main.java.com.ohgiraffers.section03.math;

public class Application01 {
    public static void main(String[] args) {

        /* API란?
        Application programing interface 는 응용프로그램에서 사용할 수 있도록
        운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스를 뜻한다.
        쉽게 말해서 우리가 구현할 수 업거나 구현하기 번거로운 기능들을 jdk를 설치하면
        사용할 수 있도록 제공해놓은 소스코드(클래스나 인터페이스)들을 의미한다.
        더 쉽게 누군가 작성해놓은 소스코드를 가져다 사용하는 것이다.
         */

//        System.out.println(java.lang.Math); java패키지않에 lang패키지안에 Math 라는 클래스 컨트롤+마우스왼쪽.

        System.out.println(java.lang.Math.abs(-7)); //static 함수였네! 클래스에서 바로 들어가보는거 보니까 절대값구해주는 함수임.
//        public static int abs(int a) {
//            return (a < 0) ? -a : a;       abs에 오른쪽 마우스 가져다놓기 - 주석? 설명 나옴

        System.out.println(java.lang.Math.abs(49.8)); // 오른쪽 마우스 가져다 놓으면 double로 바뀌어 있음






    }

}
