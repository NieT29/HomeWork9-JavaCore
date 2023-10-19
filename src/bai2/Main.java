package bai2;

import bai2.entities.Worker;
import bai2.service.WorkerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        WorkerService workerService = new WorkerService();
        workerService.menu(scanner, workers);
    }

}
