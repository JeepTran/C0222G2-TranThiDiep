package model;

public class MatBang {
    private String maMatBang;
    private int maTrangThai;
    private double dienTich;
    private int tang;
    private int maLoaiMatBang;
    private double giaTien;
    private String ngayBatDau;
    private String ngayKetThuc;

    public MatBang() {
    }

    public MatBang(String maMatBang, int maTrangThai, double dienTich, int tang,
                   int maLoaiMatBang, double giaTien, String ngayBatDau, String ngayKetThuc) {
        this.maMatBang = maMatBang;
        this.maTrangThai = maTrangThai;
        this.dienTich = dienTich;
        this.tang = tang;
        this.maLoaiMatBang = maLoaiMatBang;
        this.giaTien = giaTien;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaMatBang() {
        return maMatBang;
    }

    public void setMaMatBang(String maMatBang) {
        this.maMatBang = maMatBang;
    }

    public int getMaTrangThai() {
        return maTrangThai;
    }

    public void setMaTrangThai(int maTrangThai) {
        this.maTrangThai = maTrangThai;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getMaLoaiMatBang() {
        return maLoaiMatBang;
    }

    public void setMaLoaiMatBang(int maLoaiMatBang) {
        this.maLoaiMatBang = maLoaiMatBang;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }
}
