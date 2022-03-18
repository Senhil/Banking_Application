


abstract class Member {

     abstract void Welcome();
}


class student extends Member{

    @Override
    void Welcome() {
        System.out.println("Hello Student");
    }
}


class teacher extends Member{

    @Override
    void Welcome() {
        System.out.println("Hello Teacher");
    }
}


public class Abstractdemo {
    public static void main(String[] args) {
        student s1 = new student();
        teacher t1 = new teacher();

//      t1.Welcome();
//      Member m1 = new Member();
//      Member m1 = new student();

        Member[] m = new Member[3];
        m[0] = new student();
        m[1] = new teacher();
        m[2] = new student();

        for (Member m2 : m) {
            m2.Welcome();

        }
    }
}


