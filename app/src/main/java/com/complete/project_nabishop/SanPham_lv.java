package com.complete.project_nabishop;

public class SanPham_lv {
    private String ten;
    private String gia;
    private int hinh;

    public SanPham_lv(String ten, String gia, int hinh) {
        this.ten = ten;
        this.gia = gia;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}