package BAI6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Lop lop1 = new Lop();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-----Menu-----");
            System.out.println("--------------");
            System.out.println("1.them moi");
            System.out.println("2.hien thi toan bo hs");
            System.out.println("3. hien thi thong tin hs 20t");
            System.out.println("4. Hien thi thong tin hs 23t que DN");
            System.out.println("5. Thoat");
            System.out.println("Nhap lua chon");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    lop1.themHocSinh(scanner);
                    break;
                case 2:
                    lop1.hienThiThongTinHs();
                    break;
                case 3:
                    lop1.ShowAgeStudent();
                    break;
                case 4:
                    lop1.hienThiHs23tQueDN();
                    break;
            }
        } while (choice != 5);
    }
}
