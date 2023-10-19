package bai2.service;

import bai2.entities.STATUS;
import bai2.entities.Worker;

import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    public void menu(Scanner scanner, ArrayList<Worker> workers) {
        int select= 0;
        do {
            System.out.println("Quản lý công nhân");
            System.out.println("1.Thêm công nhân");
            System.out.println("2.Tăng lương");
            System.out.println("3.Giảm lương");
            System.out.println("4.Hiển thị lương");
            System.out.println("5.Thoát");
            System.out.println("Mời bạn chọn:");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    workers.add(addWorker(scanner));
                    break;
                case 2:
                    upSalary(scanner, workers);
                    break;
                case 3:
                    downSalary(scanner, workers);
                    break;
                case 4:
                    printInfo(workers);
            }
        } while (select != 5);
    }


    public Worker addWorker(Scanner scanner) {
        System.out.println("Mời bạn nhập tên ");
        String name= scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập lương ");
        double salary=Double.parseDouble(scanner.nextLine());
        System.out.println("Mời bạn nhập nơi làm việc ");
        String workPlace= scanner.nextLine();
        return new Worker(name,age,salary,workPlace);
    }

    public void upSalary(Scanner scanner,ArrayList<Worker> workers) {
        System.out.println("Mời bạn nhập id ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (Worker worker : workers) {
            if (inputId == worker.getId()) {
                System.out.println("Mời bạn nhập lương tăng thêm ");
                double inputUpSalary = Double.parseDouble(scanner.nextLine());
                double upSalary = worker.getSalary() + inputUpSalary;
                worker.setSalary(upSalary);
                worker.setSTATUS(STATUS.UP);
            }
        }
    }

    public void downSalary(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Mời bạn nhập id:");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (Worker worker : workers){
            if (inputId == worker.getId()) {
                System.out.println("Mời bạn nhập phần lương giảm:");
                double inputDownSalary = Double.parseDouble(scanner.nextLine());
                double downSalary=workers.get(inputId-1).getSalary()-inputDownSalary;
                worker.setSalary(downSalary);
                worker.setSTATUS(STATUS.DOWN);
            }
        }
    }

    public void printInfo(ArrayList<Worker> workers) {
        System.out.println(workers);
    }
}
