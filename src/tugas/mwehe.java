package tugas;

class Praktikum
{
    int nilai = 87;
    String nama = "andika";
    float harga = 5000;
    char jawab = 'T';
    boolean lanjut = true;
    int tgl = 7;
    int tahun = 2011;
    int jumlah = 250;
    boolean status = false;
    int jam = 11;
    int menit = 15;
    int detik = 30;
    String bulan = " maret ";

}





public class mwehe {
    public static void main(String[] args) {
        Praktikum praktikum = new Praktikum();

        System.out.println("Nilai mahasiswa " + praktikum.nama + " semester ini adalah " + praktikum.nilai);
        System.out.println("Saat ini pukul " + praktikum.jam + " : " + praktikum.menit + " :" + praktikum.detik);
        System.out.println("Hari senin jatuh pada tanggal " + praktikum.tgl + praktikum.bulan + praktikum.tahun);
        System.out.println("percetakan kartu dengan jumlah " + praktikum.jumlah + " biayanya " + praktikum.harga + " /lembar");
    }
}
