package exam2;

import java.util.Scanner;

public class MainThread {


    public static void main(String[] args) {
        createMenu();
    }

    private static void createMenu() {
        Scanner scanner = new Scanner(System.in);
        ContactController contactController = new ContactController();
        while (true) {
            System.out.println("Chương trình quản lý liên lạc ");
            System.out.println("--------------------------------");
            System.out.println("1. Thêm liên lạc mới");
            System.out.println("2. Tìm liên lạc theo tên");
            System.out.println("3. Hiển thị danh sách liên lạc");
            System.out.println("4. Thoát chương trinh ");
            System.out.print("Chọn một tùy chọn: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    contactController.create();
                    break;
                case 2:
                    contactController.findContactByName();
                    break;
                case 3:
                    contactController.showListContacts();
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println(" Vui lòng chọn 1-4");
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
    }
}
