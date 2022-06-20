package BAI6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lop {
    private int index = 0;
    private String tenLop;
    private List<HocSinh> lop2  ;

    public List<HocSinh> getLop2() {
        return lop2;
    }

    public void setLop2(List<HocSinh> lop2) {
        this.lop2 = lop2;
    }

    public Lop(String tenLop, List<HocSinh> lop2) {
        this.tenLop = tenLop;
        this.lop2 = lop2;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Lop() {
         lop2 = new ArrayList<>();
    }


    List<Lop> lopList = new ArrayList<>();
    public void themHocSinh(Scanner scanner){
        index++;
        System.out.print("Nhap ten lop muon thêm hoc sinh: ");
        String lop = scanner.next();
        System.out.print("nhap ten hs moi: ");
        String ten = scanner.next();
        System.out.print("Nhap tuoi hs moi: ");
        int tuoi = scanner.nextInt();
        System.out.print("Nhap que quan: ");
        String queQuan = scanner.next();
        HocSinh hocSinh = new HocSinh(ten,tuoi,queQuan);
        lop2.add(hocSinh);
        Lop lop1 = new Lop(lop,lop2);
        lopList.add(lop1);
    }

    public void hienThiThongTinHs(){
        for (HocSinh hocSinh: lop2) {
            System.out.println(hocSinh);
        }
    }

    public void ShowAgeStudent(){
        for (HocSinh hocSinh: lop2) {
            if (hocSinh.getTuoi()== 20){
                System.out.println(hocSinh);
            }
        }
    }
    public void hienThiHs23tQueDN(){
        for (HocSinh hocSinh: lop2) {
            if (hocSinh.getTuoi()== 20 && hocSinh.getQueQuan().equals("DN")){
                System.out.println(hocSinh);
            }
        }
    }



}
