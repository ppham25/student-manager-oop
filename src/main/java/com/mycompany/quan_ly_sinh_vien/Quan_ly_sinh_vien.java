/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quan_ly_sinh_vien;

/**
 *
 * @author Admin
 */
import java.util.*;
public class Quan_ly_sinh_vien {
    
    ArrayList<SinhVien> arrSV= new ArrayList<>();
    public void Danh_SachSV(int n){
        for(int i=0; i < n; i++){
            SinhVien sv= new SinhVien();
            sv.inputin4();
            arrSV.add(sv);
        }
    }
    
    public void Sap_xepSV(ArrayList<SinhVien> arrSV){
        arrSV.sort(Comparator.comparing(SinhVien::getPointSV, Comparator.reverseOrder())
                .thenComparing(Comparator.comparing(SinhVien::getNameSV))
                .thenComparing(SinhVien::getYearSV));
        
    }
    public void showListSV(ArrayList<SinhVien> arrSV){
        for(int i=0; i < arrSV.size(); i++){
            arrSV.get(i).outputin4();
        }
    }
    public void SearchSV(ArrayList<SinhVien> arrSV, String name){
        int vs=0;
        for(int i=0; i <arrSV.size(); i++){
            if(arrSV.get(i).getNameSV().lastIndexOf(name) >= 0){
                arrSV.get(i).outputin4();
                vs=1;
            }
        }
        if(vs==0) System.out.println("Khong co thong tin sinh vien tren");
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // muon dung cac ham phai khoi tao
        Quan_ly_sinh_vien qly = new Quan_ly_sinh_vien();
        int i=0;
        while(i==0){
            System.out.println("****************MENU**************");
            System.out.println("Moi ban lua chon");
            System.out.println("1.Nhap danh sach sinh vien");
            System.out.println("2.Hien thi thong tin sinh vien");
            System.out.println("3.Sap xep danh sach sinh vien");
            System.out.println("4.Tim kiem sinh vien");
            System.out.println("5.Thoat");
            int luachon= sc.nextInt();       
            switch (luachon) {
            case 1:
                System.out.println("Nhap cac sinh vien vao danh sach");
                int n= sc.nextInt();
                qly.Danh_SachSV(n);
                break;
            case 2:
                qly.showListSV(qly.arrSV);
                break;
            case 3:
                qly.Sap_xepSV(qly.arrSV);
                qly.showListSV(qly.arrSV);
                break;
            case 4:
                System.out.println("Nhap ten sinh vien can tim");
                sc.nextLine();
                String name= sc.nextLine();
                qly.SearchSV(qly.arrSV, name);
                break;
            default:
                i=1;
                System.out.println("Exit");
                break;
            }
        }
        
      
    }
}
