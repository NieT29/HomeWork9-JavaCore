package bai1;

import bai1.entities.Student;
import bai1.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        StudentService studentService = new StudentService();
        studentService.creatStudent(scanner,students);
        System.out.println(students);
        studentService.percentTypeStudent(students);
    }
}
