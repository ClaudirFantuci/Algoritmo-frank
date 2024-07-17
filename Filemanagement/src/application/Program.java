package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entities.Student;

public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\claudir\\Desktop\\AlgoritmoFrank\\teste.txt";
        List<Student> list = new ArrayList<Student>();

        // try with resourceseliminates the need for a "finally" to deallocate resources
        try (BufferedReader br = new BufferedReader(new FileReader(path));) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                int id = Integer.parseInt(vect[0]);
                int grade1 = Integer.parseInt(vect[1]);
                int grade2 = Integer.parseInt(vect[2]);
                int grade3 = Integer.parseInt(vect[3]);
                int grade4 = Integer.parseInt(vect[4]);
                int year = Integer.parseInt(vect[5]);
                Student student = new Student(id, grade1, grade2, grade3, grade4, year);
                list.add(student);
                line = br.readLine();
            }
            Collections.sort(list, Comparator.comparing(Student::getYear));
        } catch (IOException e) {
            System.out.println("ERRO " + e.getMessage());
        }

        OutputFile test = new OutputFile();
        List<Student> x = test.anySchoolFailure(list);
        test.outPutFileSchoolFailure(x);
        List<Student> y = test.fullyApproved(list);
        test.outPutFileFullyApproved(y);
    }
}
