package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {


        Application04 app4 = new Application04();

        String result = app4.myInfo("Kim", 20, '여', "010-2114-0000");
        System.out.println(result);

//      System.out.println(app4.myInfo("Kim", 20, '여', "010-2114-0000"));

    }

    public String myInfo(String name, int age, char gender, String phone) {
        return name + " " + age + " " + gender + " " + phone;
    }
}


