package application;

import java.util.List;

import entities.Student;

public class StudentClassification {
    public int totaltudents(List<Student> Student) {
        return Student.size();
    }

    public void approvedAndNot(List<Student> Student) {
        int approvegrade1 = 0;
        int approvegrade2 = 0;
        int approvegrade3 = 0;
        int approvegrade4 = 0;
        int disapprovedGrade1 = 0;
        int disapprovedGrade2 = 0;
        int disapprovedGrade3 = 0;
        int disapprovedGrade4 = 0;
        for (Student student2 : Student) {
            int test = student2.getGrade1();
            if (test < 70) {
                disapprovedGrade1 += 1;
            }
        }
        for (Student student2 : Student) {
            int test = student2.getGrade2();
            if (test < 70) {
                disapprovedGrade2 += 1;
            }
        }
        for (Student student2 : Student) {
            int test = student2.getGrade3();
            if (test < 70) {
                disapprovedGrade3 += 1;
            }
        }
        for (Student student2 : Student) {
            int test = student2.getGrade4();
            if (test < 70) {
                disapprovedGrade4 += 1;
            }
        }

    }
}
