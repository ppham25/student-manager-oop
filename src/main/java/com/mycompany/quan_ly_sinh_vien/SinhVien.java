/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quan_ly_sinh_vien;

/**
 *
 * @author Admin
 */
import java.util.*;
public class SinhVien {
    private String nameSV;
    private int yearSV;
    private String adrSV;
    private float pointSV;
    
    public SinhVien(){
        
    }
    
    public  SinhVien(String name, int year, String adr, float point){
        this.nameSV= name;
        this.yearSV= year;
        this.adrSV= adr;
        this.pointSV= point;
    }
    public void inputin4(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Moi ban nhap ten SV: ");
        nameSV= sc.nextLine();
        System.out.println("Moi ban nhap nam sinh SV: ");
        yearSV= sc.nextInt();
        sc.nextLine();
        System.out.println("Moi ban nhap dia chi SV: ");
        adrSV= sc.nextLine();
        System.out.println("Moi ban nhap diem SV: ");
        pointSV= sc.nextFloat();
    }
    public  void outputin4(){
        System.out.println("Ten: "+ nameSV+"\nSinh nam: "+yearSV+"\nQue: "+ adrSV+"\nDiem: "+ pointSV);
        System.out.println();
        System.out.println("---------------------------------------------");
    }
    
    public String getNameSV() {
        return nameSV;
    }

    public void setNameSV(String nameSV) {
        this.nameSV = nameSV;
    }

    public int getYearSV() {
        return yearSV;
    }

    public void setYearSV(int yearSV) {
        this.yearSV = yearSV;
    }

    public String getAdrSV() {
        return adrSV;
    }

    public void setAdrSV(String adrSV) {
        this.adrSV = adrSV;
    }

    public float getPointSV() {
        return pointSV;
    }

    public void setPointSV(float pointSV) {
        this.pointSV = pointSV;
    }
    
    
    
}
