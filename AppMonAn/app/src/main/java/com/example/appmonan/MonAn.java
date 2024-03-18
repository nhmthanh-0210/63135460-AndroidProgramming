package com.example.appmonan;

public class MonAn {
    private String tenMonAn;
    private double donGia;

    private String moTaMonAn;
    private int idAnhdaidien;


    // hàm tạo


    public MonAn(String tenMonAn, double donGia, String moTaMonAn, int idAnhdaidien) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        this.moTaMonAn = moTaMonAn;
        this.idAnhdaidien = idAnhdaidien;
    }

    // xây dựng các getter setter

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTaMonAn() {
        return moTaMonAn;
    }

    public void setMoTaMonAn(String moTaMonAn) {
        this.moTaMonAn = moTaMonAn;
    }

    public int getIdAnhdaidien() {
        return idAnhdaidien;
    }

    public void setIdAnhdaidien(int idAnhdaidien) {
        this.idAnhdaidien = idAnhdaidien;
    }
}
