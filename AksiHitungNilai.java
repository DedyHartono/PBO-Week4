public class AksiHitungNilai {
    
    public static void main(String[] args) {
        // Membuat objek Nilai
        HitungNilai AksiHitungNilai = new HitungNilai("Dedy", "13941", 80, 90, 87);
        
        // Menampilkan data nilai
        System.out.println("NIM         : " + AksiHitungNilai.getNim());
        System.out.println("Nama        : " + AksiHitungNilai.getNama());
        System.out.println("Nilai Tugas : " + AksiHitungNilai.getNilaiTugas());
        System.out.println("Nilai UTS   : " + AksiHitungNilai.getNilaiUTS());
        System.out.println("Nilai UAS   : " + AksiHitungNilai.getNilaiUAS());
        System.out.println("Nilai Huruf : " + AksiHitungNilai.getNilaiHuruf());
        System.out.println("Predikat    : " + AksiHitungNilai.getPredikat());
    }
}
