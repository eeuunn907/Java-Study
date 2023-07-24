package chap04;

public class PersonExample {
    public static void main(String[] args) {
        person sumin = new person();
        sumin.name = "수민";
        sumin.age = 17;
        sumin.hobby = "웹툰";

        person doosik = new person();
        doosik.name = "두식";
        doosik.age = 17;
        doosik.hobby = "농구";

        sumin.introduce();
        doosik.introduce();
    }
}

class person {
    String name;
    int age;
    String hobby;

    void introduce() {
        System.out.println("이름 " + name);
        System.out.println("나이 " + age);
        System.out.println("취미 " + hobby);
        System.out.print("\n");
    }
}

