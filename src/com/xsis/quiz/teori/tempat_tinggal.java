package com.xsis.quiz.teori;

public class tempat_tinggal {
    private int kamar_tidur;
    private int kamar_mandi;
    private int ac;

    public tempat_tinggal(int kamar_tidur, int kamar_mandi, int ac) {
        this.kamar_tidur = kamar_tidur;
        this.kamar_mandi = kamar_mandi;
        this.ac = ac;
    }

    public tempat_tinggal(int kamar_tidur, int kamar_mandi) {
        this.kamar_tidur = kamar_tidur;
        this.kamar_mandi = kamar_mandi;
    }

    public int getKamar_tidur() {
        return kamar_tidur;
    }

    public void setKamar_tidur(int kamar_tidur) {
        this.kamar_tidur = kamar_tidur;
    }

    public int getKamar_mandi() {
        return kamar_mandi;
    }

    public void setKamar_mandi(int kamar_mandi) {
        this.kamar_mandi = kamar_mandi;
    }

    @Override
    public String toString() {
        return "tempat_tinggal{" +
                "kamar_tidur=" + kamar_tidur +
                ", kamar_mandi=" + kamar_mandi +
                ", ac=" + ac +
                '}';
    }
}
