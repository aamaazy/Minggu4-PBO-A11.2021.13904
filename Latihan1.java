import java.util.Scanner;

public class Tugas1 {
    private String id;
    private String nama;
    private float harga;
    private int jumlah;

    public void setData(String id, String nama, float harga, int jumlah) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public float getTotalPembelian() {
        return harga * jumlah;
    }

    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada";
        }
    }

    public void cetakNota() {
        System.out.println("Kode barang: " + id);
        System.out.println("Nama barang: " + nama);
        System.out.println("Harga barang: " + harga);
        System.out.println("Jumlah barang: " + jumlah);
        System.out.println("Total pembelian: " + getTotalPembelian());
        System.out.println("Bonus: " + getBonus());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputLagi = "Y";
        while (inputLagi.equals("Y")) {
            Tugas1 penjualan = new Tugas1();

            System.out.print("Masukkan kode barang: ");
            String kode = input.nextLine();

            System.out.print("Masukkan nama barang: ");
            String nama = input.nextLine();

            System.out.print("Masukkan harga barang: ");
            float harga = input.nextFloat();

            System.out.print("Masukkan jumlah barang: ");
            int jumlah = input.nextInt();

            input.nextLine(); // clear buffer

            penjualan.setData(id, nama, harga, jumlah);
            penjualan.cetakNota();

            System.out.print("Input data lagi [Y/T]? ");
            inputLagi = input.nextLine();
        }

        input.close();
    }
    
}

//Nur Amalina Rahmaputri H//
//A11.2021.13904//



