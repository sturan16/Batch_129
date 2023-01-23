package day22staticblocksconstructors;

public class Student {
    String name;
    int age;
    int grade;
    String stdId;
    String address;

    public Student(String name, int age, int grade, String stdId, String address) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.address = address;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {//Bunlarin ustunde oynama yapabilirz
        return "Student{" +
                "Name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
