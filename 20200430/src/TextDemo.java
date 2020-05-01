import java.util.Arrays;

class TextDemo{
    public static void main(String[] args) throws CloneNotSupportedException{
        Student student1 = new Student(1,1,"a");
        Student student2 = new Student(2,2,"b");
        Student student3 = new Student(3,3,"c");
        if (student1.compareTo(student2) < 0) {
            System.out.println(student1.age < student2.age);
        }

        Student[] s = new Student[3];
        s[0] = student1;
        s[1] = student2;
        s[2] = student3;
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));

//        Person person1 = new Person();
//        Person person2 = (Person)person1.clone();
//        person2.age = 18;
//        person2.m.money = 99.9;
//        System.out.println(person1.age);
//        System.out.println(person2.age);
//        System.out.println(person1.m.money);
//        System.out.println(person2.m.money);

    }
}