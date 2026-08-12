void main() {
    Student s1 = new Student(01, "aman", 98);
    Student s2 = new Student(02, "ashish", 87);

    s1.greeting();
    s2.greeting();

}

class Student {
    int rno;
    String name;
    float marks;

    Student(int roll, String naam, float mark) {
        this.rno = roll;
        this.name = naam;
        this.marks = mark;
    }

    void greeting() {
        System.out.println("Hello my name is " + this.name + "\nMy roll no. is " + this.rno + "\nI got " + this.marks + " marks!");
    }
}