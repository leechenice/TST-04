
class Person {

    public String name;
    public int age;
    /*public char ch;
    public boolean flg;*/

    public void eat() {
        int a = 10;
        System.out.println("eat()!");
    }

    public void sleep() {
        int b = 10;
        System.out.println("sleep()");
    }

    public static void func1() {
        System.out.println("static::func1()");

    }

    public void show() {

    }

}
class Test{
    public int a;
    public static int count;
}
class TestDemo{

    public static void func() {

    }
    public void func2() {

    }
    public static void main(String[] args) {
        func();
        /*TestDemo2 testDemo2 = new TestDemo2();
        testDemo2.func2();*/
    }

    public static void main5(String[] args) {
        Test t1 = new Test();
        t1.a++;//1
        Test.count++;//1
        System.out.println(t1.a);//1
        System.out.println(Test.count);//1
        System.out.println("============");
        Test t2 = new Test();
        t2.a++;//1
        Test.count++;//2
        System.out.println(t2.a);//1
        System.out.println(Test.count);//2
    }

    public static void main4(String[] args) {
        Person per = new Person();
        per.show();
        per.age = 20;
        per.show()
        /*per.eat();
        per.sleep()*/;
        //Person.func1();
    }

    public static void main3(String[] args) {

       /* Person per = new Person();
        System.out.println(per.name);*/

    }

    public static void main2(String[] args) {
        Person per = new Person();

        System.out.println(per.name);
        per.name = "bit";
        System.out.println(per.name);
        System.out.println(per.age);
    }
    public static void main1(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}

