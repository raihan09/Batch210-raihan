package quiz1;

public class quiz {
    public static void main(String[] args) {
double hargaOtr= 245;
double bunga = 5;
double tenor = 3;
double premi = 9.5;
double dp = 0.2;
double biayaAdmin = 0.55;
quiz jawaban = new quiz();
        System.out.println("Total Bunga yang Harus Dibayar : " +jawaban.bungaHarusDibayar(hargaOtr,bunga,tenor));
                System.out.println("Angsuran Bulanan  : "+jawaban.angsuranBulanan(hargaOtr,bunga,tenor));
        System.out.println("Total Angsuran Bulan pertama : "+jawaban.angsuranBulanPertama(hargaOtr,bunga,tenor,dp,premi,biayaAdmin));
    }
    double bungaHarusDibayar(double hargaOtr,double bunga,double tenor){
        double plafon =0.2*hargaOtr;
        return plafon*((bunga*tenor)/100);
    }
    double angsuranBulanan(double hargaOtr,double bunga,double tenor){
        double plafon =0.2*hargaOtr;
        return (plafon+bungaHarusDibayar(hargaOtr,bunga,tenor )/tenor*12);
    }
    double angsuranBulanPertama(double hargaOtr,double bunga,double tenor, double dp,double premi,double biayaAdmin){
        dp *=hargaOtr;double
                premiBulan = premi/100 * hargaOtr/12;
        return dp+angsuranBulanan(hargaOtr,bunga,tenor)+premiBulan+biayaAdmin;
    }
}
















