package tugas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Booksystem
{
    private String nama;
    private String telf;
    private String email;
    private String alamat;
    private int[][] room = {
        { 0, 101, 1000000 },
        { 1, 102, 2500000 },
        { 0, 103, 500000 },
        { 0, 104, 750000 },
        { 1, 105, 1250000 }
    };
    private Scanner scanner;

    public Booksystem() {
        scanner = new Scanner(System.in);
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
        // this.telf = noTelp;
        if (noTelp.matches("\\d{10,}$")){
            this.telf = "+62" + noTelp.substring(noTelp.length() - 10);
        }else if (noTelp.matches("^\\+62\\d{11,}$")) {
            this.telf = noTelp;
        } else {
            System.out.println("Invalid phone number format");
        }
    }
    public String getNoTelp() {
        return this.telf;
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

    public void init(String nama, String noTelp, String alamat, String email) {
        setNama(nama);
        setNoTelp(noTelp);
        setAlamat(alamat);
        setEmail(email);
    }

    // Method untuk menampilkan informasi pribadi
    public void dispPerson() {
        System.out.println("Nama           : " + this.nama);
        System.out.println("Nomor Telepon  : " + this.telf);
        System.out.println("Alamat         : " + this.alamat);
        System.out.println("Email          : " + this.email);
    }


    public void bookRoom() {
        System.out.println("Ketersediaan Kamar");
        System.out.println("------------------");
        System.out.println("No Kamar | Harga");

        for (int i = 0; i < room.length; i++) {
            if (room[i][0] == 0) {
                System.out.printf("%8d | %,10d%n", room[i][1], room[i][2]);
            }
            else{
                System.out.printf("%8d | %,10d (Tidak Tersedia) %n", room[i][1], room[i][2]);
            }
        }

        int noRoom;
        while (true) {
            System.out.print("Pilih nomor kamar: ");
            noRoom = scanner.nextInt();

            if (noRoom >= 101 && noRoom <= 105) {
                if (room[noRoom - 101][0] == 1) {
                    System.out.println("Kamar tidak tersedia");
                } else {
                    room[noRoom - 101][0] = 1;
                    doPayment(noRoom);
                }
                break;
            } else {
                System.out.println("Nomor kamar tidak tersedia. Silakan coba lagi.");
            }
        }

        System.out.print("Apakah anda ingin memesan kamar lagi? (y/n) ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            bookRoom();
        } else {
            System.out.println("Terima kasih telah memesan kamar!");
        }
    }

    public void doPayment(int noRoom) {
        int harga = room[noRoom - 101][2];

        System.out.printf("Silahkan melakukan pembayaran sebesar Rp%,d%n", harga);

        int bayar = 0;

        do {
            System.out.print("Masukkan jumlah pembayaran: ");
            bayar = scanner.nextInt();

            if (bayar == harga) {
                System.out.println("Pembayaran berhasil");
                break;
            } else {
                System.out.println("Jumlah pembayaran tidak sesuai dengan harga kamar. Silakan coba lagi.");
            }
        } while (true);

        System.out.print("Apakah anda ingin memesan kamar lagi? (y/n) ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("y")) {
            bookRoom();
        } else {
            System.out.println("Terima kasih telah memesan kamar!");
            System.exit(0);
        }
    }


}
    
    




class EmailValidator 
{
    private Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =
    "^([\\w\\d.\\-_]+)@([\\w\\d.\\-_]+)\\.([a-zA-Z]{2,5})(\\.[a-zA-Z]{2,5})?$";

    public EmailValidator() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

}

public class tigas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Booksystem obj = new Booksystem();
        
        // Input data from user
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("No. Telp(+62xxx): ");
        String telf = input.nextLine();
        // if (telf.matches("^\\+62\\d{11}$")) {
        //     System.out.println("Nomor telepon valid");
        // } else {
        //     System.out.println("Nomor telepon tidak valid");
        //     System.exit(0);
        // }
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        while (!new EmailValidator().validate(email)) {
            System.out.print("Email tidak valid. Masukkan kembali: ");
                email = input.nextLine();
        }
                
        System.out.print("\033[H\033[2J");  
        System.out.flush();         
        obj.init(nama, telf, alamat, email);

        obj.dispPerson();

        obj.bookRoom();
                
        input.close();
        
    }
}
