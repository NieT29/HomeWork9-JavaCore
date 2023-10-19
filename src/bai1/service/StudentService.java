package bai1.service;

import bai1.entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner) {
        System.out.println("Mời bạn nhập tên ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm Toán ");
        double scoreMath = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm Lý ");
        double scorePhysic = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập điểm Hóa ");
        double scoreChemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name,scoreMath,scorePhysic,scoreChemistry);
    }

    public void creatStudent(Scanner scanner, ArrayList<Student> students) {
        String select = "";
        do {
            Student student = inputStudent(scanner);
            students.add(student);
            System.out.println("Bạn có muốn tiếp tục nhập không(Y/N) ");
            select = scanner.nextLine();
        } while (select.equalsIgnoreCase("Y"));
    }

    public void calStudent(double coutA, double coutB, double coutC, int numberOfStudent) {
        double percentA = coutA/numberOfStudent*100;
        double percentB = coutB/numberOfStudent*100;
        double percentC = coutC/numberOfStudent*100;
        System.out.println(percentA+"% - "+percentB+"% - "+percentC+"%");
    }

    public void percentTypeStudent(ArrayList<Student> students) {
        int coutA = 0, coutB = 0, coutC = 0;
        for (Student student: students) {
            if (student.classify().equals("Xếp loại A")) coutA++;
            else if (student.classify().equals("Xếp loại B")) coutB++;
            else coutC++;
        }
        System.out.println("Xếp loại A: "+coutA+ " - Xếp loại B: "+coutB+" - Xếp loại C: "+coutC);
        calStudent(coutA, coutB, coutC, students.size());
    }

}
