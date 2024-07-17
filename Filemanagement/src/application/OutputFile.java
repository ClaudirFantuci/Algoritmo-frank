package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import entities.Student;

public class OutputFile {
    public List<Student> fullyApproved(List<Student> Student) {
        List<Student> approvedStudents = new ArrayList<>();
        for (Student student2 : Student) {
            if (student2.getGrade1() >= 70 && student2.getGrade2() >= 70 && student2.getGrade3() >= 70
                    && student2.getGrade4() >= 70) {
                approvedStudents.add(student2);
            }
        }
        return approvedStudents;
    }

    public List<Student> anySchoolFailure(List<Student> Student) {
        List<Student> schoolFailure = new ArrayList<>();
        for (Student student2 : Student) {
            if (student2.getGrade1() < 70 || student2.getGrade2() < 70 || student2.getGrade3() < 70
                    || student2.getGrade4() < 70) {
                schoolFailure.add(student2);
            }
        }
        return schoolFailure;
    }

    public void outPutFileSchoolFailure(List<Student> Student) {
        try (FileWriter arq = new FileWriter(
                "C:\\Users\\claudir\\Desktop\\ alunos que possuem reprovações em uma ou mais disciplinas.txt")) {
            PrintWriter writeFiles = new PrintWriter(arq);
            for (Student student2 : Student) {
                writeFiles.println(student2);
            }
        } catch (IOException e) {
            System.out.println("ERRO " + e.getMessage());
        }
    }

    public void outPutFileFullyApproved(List<Student> Student) {
        try (FileWriter arq = new FileWriter(
                "C:\\Users\\claudir\\Desktop\\alunos aprovados em todas as disciplinas.txt")) {
            PrintWriter writeFiles = new PrintWriter(arq);
            for (Student student2 : Student) {
                writeFiles.println(student2);
            }
        } catch (IOException e) {
            System.out.println("ERRO " + e.getMessage());
        }
    }

}
