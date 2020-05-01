public class Student implements Comparable<Student>{
    int age;
    double score;
    String name;

    public Student(int age, double score, String name) {
        this.age = age;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age,o.age);
    }
}
