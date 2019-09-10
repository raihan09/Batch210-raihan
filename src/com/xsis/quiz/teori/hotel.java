package com.xsis.quiz.teori;

public class hotel extends rumah {
    private int laundry;

    public hotel(int kamar_tidur, int kamar_mandi, int ac, int garasi, int laundry) {
        super(kamar_tidur, kamar_mandi, ac, garasi);
        this.laundry = laundry;
    }

    public int getLaundry() {
        return laundry;
    }

    public void setLaundry(int laundry) {
        this.laundry = laundry;

    }

    @Override
    public int getBanyak_ruangan() {
        return super.getBanyak_ruangan()+this.laundry;

    }

    @Override
    public String toString() {
        return super.toString()+" laundry = "+getLaundry();
    }
}
