package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Student;

public class GradesCalculator {

    public double[] calculateAverageGrades(List<Student> students) {
        double[] avaraGrades = new double[4];

        for (Student student : students) {
            avaraGrades[0] += student.getGrade1();
            avaraGrades[1] += student.getGrade2();
            avaraGrades[2] += student.getGrade3();
            avaraGrades[3] += student.getGrade4();
        }

        int numberOfStudents = students.size();
        for (int i = 0; i < avaraGrades.length; i++) {
            avaraGrades[i] /= numberOfStudents;
        }

        return avaraGrades;
    }

    public List<Integer>[] calculateMedian(List<Student> students) {
        List<Integer>[] grades = new List[] { new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>() };

        for (Student student : students) {
            grades[0].add(student.getGrade1());
            grades[1].add(student.getGrade2());
            grades[2].add(student.getGrade3());
            grades[3].add(student.getGrade4());
        }

        for (List<Integer> grade : grades) {
            Collections.sort(grade);
            int size = grade.size();
            double median;
            if (size % 2 == 0) {
                median = (grade.get(size / 2 - 1) + grade.get(size / 2)) / 2.0;
            } else {
                median = grade.get(size / 2);
            }
        }
        return grades;

    }

    public double[] standardDeviation(List<Student> students) {
        double[] totals = new double[4];
        double[] averages = new double[4];
        double[] sumValues = new double[4];

        for (Student student : students) {
            totals[0] += student.getGrade1();
            totals[1] += student.getGrade2();
            totals[2] += student.getGrade3();
            totals[3] += student.getGrade4();
        }

        int numberOfStudents = students.size();
        for (int i = 0; i < 4; i++) {
            averages[i] = totals[i] / numberOfStudents;
        }

        for (Student student : students) {
            sumValues[0] += Math.pow(student.getGrade1() - averages[0], 2);
            sumValues[1] += Math.pow(student.getGrade2() - averages[1], 2);
            sumValues[2] += Math.pow(student.getGrade3() - averages[2], 2);
            sumValues[3] += Math.pow(student.getGrade4() - averages[3], 2);
        }

        for (int i = 0; i < 4; i++) {
            double result = sumValues[i] / numberOfStudents;
            double standardDeviation = Math.sqrt(result);
            // fazer algo com a desvio padrão, como imprimir ou armazenar em uma variável
            System.out.println("Standard Deviation " + (i + 1) + ": " + standardDeviation);
        }
        return sumValues;
    }
}
