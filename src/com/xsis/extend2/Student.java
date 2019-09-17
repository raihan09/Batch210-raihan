package com.xsis.extend2;

public class Student {
    private String nim;
    private String nama;
    private String jurusan;
    static int totalStudent = 0;

    public Student(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        totalStudent++;

    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    void totalStudent(){
        int total =0;
    }
}



