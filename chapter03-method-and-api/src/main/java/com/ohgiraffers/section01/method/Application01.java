package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {
        /* 메소드
         * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
         * 항상 동일한 작업을 수행하기 때문에 논리, 규칙에 맞는 답이 일정하게 나와야한다.
         * */

        System.out.println("main() 시작됨....");

        Application01 app1 = new Application01();
        app1.methodA();

        System.out.println("main() 종료됨..");
    }

    public void methodA() {
        methodB();
        System.out.println("methodA()를 호출함");
        return;
    }

    public void methodB() {
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");
    }

    public void methodC() {
        System.out.println("methodC() 시작됨");
        System.out.println("methodC() 종료됨");
    }

}


