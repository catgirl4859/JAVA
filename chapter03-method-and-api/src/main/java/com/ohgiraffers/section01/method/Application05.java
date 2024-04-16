package main.java.com.ohgiraffers.section01.method;

public class Application05 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();
        int min = cal.minNumber(first, second);
        System.out.println(min);

        int max = Calculator.maxNumber(first, second);
        System.out.println(max);

//      int max = cal.maxNumber(first, second);
//      을 해도 되지만 권장하지 않는다.
//      보기에 식이 같아도 접근경로가 다르기 때문에 권장하는 방법으로 static 영역 사용하길!

    }
}


