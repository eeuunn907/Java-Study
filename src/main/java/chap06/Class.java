package chap06;

class Person {
    String name = "사람";

    void whoAmI() {
        System.out.println("나는 사람이다.");
    }
}

class Student extends Person {
    String name = "학생";

    void whoAmI() {
        System.out.println("나는 학생이다.");
    }
}

class ProgrammingStudent extends Student {
    String name = "프로그래밍 수강 학생";

    void whoAmI() {
        System.out.println("나는 프로그래밍 수강 학생이다.");
    }
}

public class Class {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        p[0] = new Student();
        p[1] = new ProgrammingStudent();

        System.out.println(p[0].name);
        p[0].whoAmI();
        System.out.println(p[1].name);
        p[1].whoAmI();
    }

}