package main.java.com.ohgiraffers.section01.method;

public class Application03 {
    public static void main(String[] args) {

        Application03 apple = new Application03();

        int x =100;
        int y= 10;

        int result1 = apple.plus(x, y);
        System.out.println("x+y = "+result1);

        int result2 = apple.minus(x, y);
        System.out.println("x-y = "+result2);

        int result3 = apple.multiplication(x, y);
        System.out.println("x*y = "+result3);

        int result4 = apple.divide(x, y);
        System.out.println("x/y = "+result4);

    }

    public int plus(int x, int y){
        return x+y;
    }
    public int minus(int x, int y){
        return x-y;
    }
    public int multiplication(int x, int y){
        return x*y;
    }
    public int divide(int x, int y){
        return x/y;
    }

}
