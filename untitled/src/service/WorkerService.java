package service;

import entities.STATUS;
import entities.Worker;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WorkerService {
    String choise;
    int select;

    public boolean menu(Scanner scanner, ArrayList<Worker> workers){
        do {
            System.out.println("Bảng quản lý công nhân");
            System.out.println("1.Thêm công nhân");
            System.out.println("2.Tăng lương");
            System.out.println("3.Giảm lương");
            System.out.println("4.In thông tin công nhân ra màn hình");
            System.out.println("5.Thoát");
            System.out.println("Mời bạn chọn:");
            select=Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1:
                    workers.add(inputWorker(scanner, workers));
                    break;
                case 2:
                    upSalary(scanner,workers);
                    break;
                case 3:
                    downSalary(scanner,workers);
                case 4:
                    printInfo(workers);
            }
        }while (select!=5);
        return false;
    }

    // thêm công nhân
    public Worker inputWorker(Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên công nhân ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi của công nhân");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập lương ");
        double salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập chức vụ");
        String workPlace = scanner.nextLine();
        Worker worker = new Worker(id, name, age, salary, workPlace );
        return worker;
    }

//    public Worker addWorker (Scanner scanner, ArrayList<Worker> workers){
//
//        do {
//            Worker worker = inputWorker(scanner);
//            workers.add(worker);
//            System.out.println("có tiếp tục thêm công nhân không (Y/N)?");
//            choise = scanner.nextLine();
//        } while (choise.equalsIgnoreCase("y"));
//    }

    // tăng lương
    public void upSalary (Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("nhập id công nhân cần tăng lương");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lương thay đổi");
        double salaryChange = Double.parseDouble(scanner.nextLine());
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                worker.setSalary(salaryChange);
                worker.setSTATUS(STATUS.UP);
            }
            worker.setDayChange(LocalDate.now());
        }

    }

    // giảm lương
    public void downSalary (Scanner scanner, ArrayList<Worker> workers) {
        System.out.println("nhập id công nhân cần giảm lương");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số lương thay đổi");
        double salaryChange = Double.parseDouble(scanner.nextLine());
        for (Worker worker : workers) {
            if (worker.getId() == id) {
                worker.setSalary(salaryChange);
                worker.setSTATUS(STATUS.DOWN);
            }
            worker.setDayChange(LocalDate.now());
        }
    }

    //    in ra
    public void printInfo(ArrayList<Worker> workers) {
        System.out.println(workers);
    }
}
