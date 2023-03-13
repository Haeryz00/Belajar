public class App {
    private String nama;
    private String noTelp;
    private String alamat;
    private String email;
    private int[][] room = {{1, 101, 1000000}, {0, 102, 1500000}, {1, 103, 2000000}, {0, 104, 2500000}, {1, 105, 3000000}};
    
    public App(String nama, String noTelp, String alamat, String email) {
        this.nama = nama;
        this.noTelp = noTelp;
        this.alamat = alamat;
        this.email = email;
    }
    
    // Getter dan setter method untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    
    // Getter dan setter method untuk atribut noTelp
    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public String getNoTelp() {
        return this.noTelp;
    }
    
    // Getter dan setter method untuk atribut alamat
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getAlamat() {
        return this.alamat;
    }
    
    // Getter dan setter method untuk atribut email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    
    // Method untuk menampilkan informasi pribadi
    public void dispPerson() {
        System.out.println("Nama           : " + this.nama);
        System.out.println("Nomor Telepon  : " + this.noTelp);
        System.out.println("Alamat         : " + this.alamat);
        System.out.println("Email          : " + this.email);
    }
    
    // Method untuk memilih kamar dan melakukan pemesanan
    public void bookRoom() {
        System.out.println("Kamar yang tersedia:");
        for (int i = 0; i < room.length; i++) {
            if (room[i][0] == 0) {
                System.out.println(room[i][1]);
            }
        }
    }
    
    // Method untuk melakukan pembayaran dan mengubah status kamar
    public void doPayment(int noRoom) {
        if (room[noRoom][0] == 0) {
            System.out.println("Pembayaran berhasil dilakukan.");
            room[noRoom][0] = 1;
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }
}
