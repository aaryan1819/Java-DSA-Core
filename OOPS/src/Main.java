void main() {
    Student s1 = new Student(01, "aman", 98);
    Student s2 = new Student(02, "ashish", 87);
    CSEStudent cseStudent = new CSEStudent(03, "adib", 77, "https://github.com/aaryan1819");

//    s1.greeting();
//    s2.greeting();
//    s1.setMarks(650);
//    System.out.println(s1.getMarks());
//    System.out.println(s2.getName());
    cseStudent.setGithuburl("https://github.com/aaryan1819");
    System.out.println(cseStudent.getGithuburl());
//    cseStudent.greet();
}

class Student {
    private int rno;
    private String name;
    private float marks;

    Student(int roll, String naam, float mark) {
        this.rno = roll;
        this.name = naam;
        this.marks = mark;
    }

    public float getMarks() {
//        float mark = this.marks;
        return this.marks;
    }

    public void setMarks(float mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Enter a valid mark. (0-100)");
        }
        else {
            this.marks = mark;
        }
    }

    public int getRno() {
        return this.rno;
    }

    public void setRno(int roll) {
        this.rno = roll;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String naam) {
        this.name = naam;
    }

    void greeting() {
        System.out.println("Hello my name is " + this.name + "\nMy roll no. is " + this.rno + "\nI got " + this.marks + " marks!");
    }
}

class CSEStudent extends Student {
    private String githuburl;
    CSEStudent(int roll, String naam, float mark, String url ) {
        super(roll, naam, mark);
        this.githuburl = url;
    }

    public String getGithuburl() {
        return githuburl;
    }

    void setGithuburl(String url) {
        this.githuburl = url;
    }

    void greet() {
        super.greeting();
        System.out.println("githuburl : " + this.githuburl);
    }
}