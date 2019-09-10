package com.xsis.quiz.teori;

public class rumah extends tempat_tinggal {
    private int garasi;
    private int banyak_ruangan;

    public int getBanyak_ruangan() {
        banyak_ruangan = super.getKamar_mandi()+super.getKamar_tidur()+this.getGarasi();
        return banyak_ruangan;
    }

    public void setBanyak_ruangan(int banyak_ruangan) {
        this.banyak_ruangan = banyak_ruangan;
    }

    public rumah(int kamar_tidur, int kamar_mandi, int ac, int garasi) {
        super(kamar_tidur, kamar_mandi, ac);
        this.garasi = garasi;
    }

    public int getGarasi() {
        return garasi;
    }

    public void setGarasi(int garasi) {
        this.garasi = garasi;
    }

    @Override
    public String toString() {
        return super.toString()+" garasi= " +getGarasi()+ " banyak ruangan= "+ getBanyak_ruangan();
    }
}

