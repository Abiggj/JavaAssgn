package Students;

class Student {
    private String prn;
    private String name;
    private String dob;
    private int marks;

    public Student(String prn, String name, String dob, int marks) {
        this.prn = prn;
        this.name = name;
        this.dob = dob;
        this.marks = marks;
    }

    public String getPrn() {
        return prn;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {
        return "PRN: " + prn + "\nName: " + name + "\nDate of Birth: " + dob + "\nMarks: " + marks + "\n";
    }
}