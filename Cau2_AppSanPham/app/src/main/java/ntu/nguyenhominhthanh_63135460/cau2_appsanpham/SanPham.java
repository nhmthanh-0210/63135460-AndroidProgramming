package ntu.nguyenhominhthanh_63135460.cau2_appsanpham;

public class SanPham {

    private String tenSanPham;
    private double donGia;

    private String moTaSanPham;
    private int idAnhdaidien;

    public SanPham(String tenSanPham, double donGia, String moTaSanPham, int idAnhdaidien) {
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.moTaSanPham = moTaSanPham;
        this.idAnhdaidien = idAnhdaidien;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public int getIdAnhdaidien() {
        return idAnhdaidien;
    }

    public void setIdAnhdaidien(int idAnhdaidien) {
        this.idAnhdaidien = idAnhdaidien;
    }
}
