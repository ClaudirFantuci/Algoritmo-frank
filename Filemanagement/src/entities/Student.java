package entities;

public class Student {
    private int id;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int year;

    public int getId() {
        return id;
    }

    public int getGrade1() {
        return grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public int getGrade3() {
        return grade3;
    }

    public int getGrade4() {
        return grade4;
    }

    public int getYear() {
        return year;
    }

    public Student(int id, int grade1, int grade2, int grade3, int grade4, int year) {
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", grade1=" + grade1 + ", grade2=" + grade2 + ", grade3=" + grade3 + ", grade4="
                + grade4 + ", year=" + year + "]";
    }

    public static int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

}
