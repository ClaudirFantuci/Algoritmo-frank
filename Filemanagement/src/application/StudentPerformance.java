package application;

import java.util.List;

import entities.Student;

public class StudentPerformance {
    public void bestStudent(List<Student> list) {
        double[] bestGrade = new double[6];
        double median = 0;
        for (Student student2 : list) {
            if (median < (student2.getGrade1() + student2.getGrade2() + student2.getGrade3() + student2.getGrade4())
                    / 4) {
                median = (student2.getGrade1() + student2.getGrade2() + student2.getGrade3() + student2.getGrade4())
                        / 4;
                bestGrade[0] = student2.getId();
                bestGrade[1] = student2.getGrade1();
                bestGrade[2] = student2.getGrade2();
                bestGrade[3] = student2.getGrade3();
                bestGrade[4] = student2.getGrade4();
                bestGrade[5] = student2.getYear();
            }
        }
        for (int x = 0; x < bestGrade.length; x++) {
            System.out.println(bestGrade[x]);
        }
    }

    public void worseStudent(List<Student> list) {
        int[] worseGrade = new int[6];
        double median = Double.MAX_VALUE;
        for (Student student2 : list) {
            if (median > (student2.getGrade1() + student2.getGrade2() + student2.getGrade3() + student2.getGrade4())
                    / 4) {
                median = (student2.getGrade1() + student2.getGrade2() + student2.getGrade3() + student2.getGrade4())
                        / 4;
                worseGrade[0] = student2.getId();
                worseGrade[1] = student2.getGrade1();
                worseGrade[2] = student2.getGrade2();
                worseGrade[3] = student2.getGrade3();
                worseGrade[4] = student2.getGrade4();
                worseGrade[5] = student2.getYear();
            }
        }
        for (int x = 0; x < worseGrade.length; x++) {
            System.out.println(worseGrade[x]);
        }
    }

}
