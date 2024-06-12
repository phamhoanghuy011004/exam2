package exam2;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {
   ArrayList<Contact> contacts = new ArrayList<>();
   Scanner scanner = new Scanner(System.in);

    public void create() {
        System.out.println("Vui lòng nhập thông tin liên lạc:");

        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập công ty: ");
        String company = scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, company, email, phone);
        contacts.add(contact);
        System.out.println("Đã thêm liên lạc thành công.");
    }

    public void findContactByName() {
        System.out.print("Nhập tên để tìm: ");
        String name = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Phone: " + contact.getPhone());
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void showListContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Không có liên lạc nào.");
            return;
        }

        System.out.println("                                          Address Book ");
        System.out.printf("%-20s %-20s %-30s %-15s\n", "ContactName", "Company", "Email", "Phone number");
        System.out.println("                                                        ");
        for (Contact contact : contacts) {
            System.out.printf("%-20s %-20s %-30s %-15s\n", contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
        }
    }
}
